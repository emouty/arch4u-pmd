/*
 * MIT License
 *
 * Copyright (c) 2019-2022 Yurii Dubinka
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom
 * the Software is  furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE
 * OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.github.dgroup.arch4u.pmd;

import java.util.List;
import net.sourceforge.pmd.lang.ast.Node;
import net.sourceforge.pmd.lang.java.ast.ASTVariableDeclaratorId;
import net.sourceforge.pmd.lang.java.rule.AbstractPoorMethodCall;
import net.sourceforge.pmd.lang.java.symboltable.JavaNameOccurrence;
import net.sourceforge.pmd.lang.java.xpath.TypeIsExactlyFunction;
import net.sourceforge.pmd.lang.java.xpath.TypeIsFunction;
import net.sourceforge.pmd.lang.symboltable.NameOccurrence;
import net.sourceforge.pmd.properties.PropertyDescriptor;
import net.sourceforge.pmd.properties.PropertyFactory;
import org.apache.commons.lang3.StringUtils;

/**
 * A rule that prohibits the using methods of a particular class.
 *
 * @see <a href="https://github.com/dgroup/arch4u-pmd/issues/22">
 *     https://github.com/dgroup/arch4u-pmd/issues/22</a>
 * @since 0.4.0
 */
@SuppressWarnings("PMD.StaticAccessToStaticFields")
public final class AvoidProhibitedMethodInvocation extends AbstractPoorMethodCall {

    /**
     * Property descriptor with test class suffix.
     */
    private static final PropertyDescriptor<String> CLASS =
        PropertyFactory.stringProperty("class")
            .desc("The fully qualified name of the class")
            .defaultValue(StringUtils.EMPTY)
            .build();

    /**
     * Property descriptor with the list of the prohibited methods.
     */
    private static final PropertyDescriptor<List<String>> METHODS =
        PropertyFactory.stringListProperty("methods")
            .desc("List of prohibited methods")
            .emptyDefaultValue()
            .build();

    /**
     * A property descriptor with the property that is responsible for
     * whether subtypes should be checked.
     */
    private static final PropertyDescriptor<Boolean> CHECK_SUBTYPES =
        PropertyFactory.booleanProperty("checkSubtypes")
            .desc("The property matches whether the subtypes should be checked")
            .defaultValue(false)
            .build();

    /**
     * Constructor for defining property descriptor.
     */
    @SuppressWarnings("PMD.ConstructorOnlyInitializesOrCallOtherConstructors")
    public AvoidProhibitedMethodInvocation() {
        this.definePropertyDescriptor(CLASS);
        this.definePropertyDescriptor(METHODS);
        this.definePropertyDescriptor(CHECK_SUBTYPES);
    }

    @Override
    public Object visit(final ASTVariableDeclaratorId node, final Object data) {
        if (node.getNameDeclaration() != null && this.hasNotedClass(node)) {
            for (final NameOccurrence usage : node.getUsages()) {
                final JavaNameOccurrence occurrence = (JavaNameOccurrence) usage;
                if (this.isNotedMethod(occurrence.getNameForWhichThisIsAQualifier())) {
                    this.addViolation(
                        data, occurrence.getLocation(), new String[]{
                            this.targetTypename(),
                            occurrence.getNameForWhichThisIsAQualifier().getImage(),
                        }
                    );
                }
            }
        }
        return data;
    }

    @Override
    public String targetTypename() {
        return this.getProperty(CLASS);
    }

    @Override
    public String[] methodNames() {
        return this.getProperty(METHODS).toArray(new String[0]);
    }

    @Override
    public boolean isViolationArgument(final Node node) {
        throw new UnsupportedOperationException();
    }

    /**
     * Checks if the class of the variable is specified in the rule properties.
     * @param node Variable declarator node.
     * @return True if the node class is specified.
     */
    private boolean hasNotedClass(final ASTVariableDeclaratorId node) {
        final boolean noted;
        if (this.getProperty(CHECK_SUBTYPES)) {
            noted = TypeIsFunction.typeIs(node.getTypeNode(), this.targetTypename());
        } else {
            noted = TypeIsExactlyFunction.typeIsExactly(node.getTypeNode(), this.targetTypename());
        }
        return noted;
    }

    /**
     * Checks if the variable occurrence contains prohibited method.
     * @param occurrence Variable occurrence.
     * @return True if the occurrence contains prohibited method.
     */
    private boolean isNotedMethod(final NameOccurrence occurrence) {
        boolean noted = false;
        if (occurrence != null) {
            final String invocation = occurrence.getImage();
            noted = this.getProperty(METHODS).contains(invocation);
        }
        return noted;
    }
}
