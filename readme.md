[![Maven](https://img.shields.io/maven-central/v/io.github.dgroup/arch4u-pmd.svg)](https://mvnrepository.com/artifact/io.github.dgroup/arch4u-pmd)
[![Javadocs](http://www.javadoc.io/badge/io.github.dgroup/arch4u-pmd.svg)](http://www.javadoc.io/doc/io.github.dgroup/arch4u-pmd)
[![License: MIT](https://img.shields.io/github/license/mashape/apistatus.svg)](./license.txt)
[![Commit activity](https://img.shields.io/github/commit-activity/y/dgroup/arch4u-pmd.svg?style=flat-square)](https://github.com/dgroup/arch4u-pmd/graphs/commit-activity)
[![Hits-of-Code](https://hitsofcode.com/github/dgroup/arch4u-pmd)](https://hitsofcode.com/view/github/dgroup/arch4u-pmd)

[![CI](https://github.com/dgroup/arch4u-pmd/actions/workflows/build.yml/badge.svg)](https://github.com/dgroup/arch4u-pmd/actions/workflows/build.yml)
[![0pdd](http://www.0pdd.com/svg?name=dgroup/arch4u-pmd)](http://www.0pdd.com/p?name=dgroup/arch4u-pmd)
[![Dependency Status](https://requires.io/github/dgroup/arch4u-pmd/requirements.svg?branch=master)](https://requires.io/github/dgroup/arch4u-pmd/requirements/?branch=master)
[![Known Vulnerabilities](https://snyk.io/test/github/dgroup/arch4u-pmd/badge.svg)](https://app.snyk.io/org/dgroup/project/c8b51bb3-7683-41c8-9a4e-b32a6f9069b6)

[![DevOps By Rultor.com](http://www.rultor.com/b/dgroup/arch4u-pmd)](http://www.rultor.com/p/dgroup/arch4u-pmd)
[![EO badge](http://www.elegantobjects.org/badge.svg)](http://www.elegantobjects.org/#principles)
[![We recommend IntelliJ IDEA](http://www.elegantobjects.org/intellij-idea.svg)](https://www.jetbrains.com/idea/)

[![Qulice](https://img.shields.io/badge/qulice-passed-blue.svg)](http://www.qulice.com/)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=dgroup_arch4u-pmd&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=dgroup_arch4u-pmd)
[![codebeat badge](https://codebeat.co/badges/07852d4a-459c-4775-949d-833e3eeebcfe)](https://codebeat.co/projects/github-com-dgroup-arch4u-pmd-master)
[![Codacy Badge](https://app.codacy.com/project/badge/Grade/53d3d211de354b45a06aaa82dcf432b5)](https://www.codacy.com/gh/dgroup/arch4u-pmd/dashboard?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=dgroup/arch4u-pmd&amp;utm_campaign=Badge_Grade)
[![Codecov](https://codecov.io/gh/dgroup/arch4u-pmd/branch/master/graph/badge.svg)](https://codecov.io/gh/dgroup/arch4u-pmd)

*   [Overview](#overview)

*   [How to use?](#how-to-use)

*   [How to contribute?](#how-to-contribute)

*   [Contributors](#contributors)

### Overview

**arch4u-pmd** is a library with pmd rules that bring new regulations related to known problems in REST API, logging, monitoring, etc., including reconfigured default/out of box pmd rules considering well-known frameworks like Spring, Quarkus, etc.
We are using the latest stable pmd-java version which is `6.42.0` as a start point.

*Legend*

🚴🏽 - in-progress, 
⌛ - planned for review considering framework architecture, 
✅ - enabled in `arch4u-ruleset.xml`, 
🌵 - reconfigured in `arch4u-ruleset.xml`, 
❌ - disabled/not planned in `arch4u-ruleset.xml`

| PMD rule                                                                                                                                               |  Provider  | Since  | Status | Spring | Quarkus |
|:-------------------------------------------------------------------------------------------------------------------------------------------------------|:----------:|:------:|:------:|:------:|:-------:|
| [UseExistingMediaTypeConstant](https://github.com/dgroup/arch4u-pmd/discussions/43)                                                                    | arch4u-pmd | 0.1.0  |   ✅    |   ⌛    |    ⌛    |
| [UseOpenApiInRestEndpoints](https://github.com/dgroup/arch4u-pmd/discussions/73)                                                                       | arch4u-pmd | 0.1.0  |   ✅    |   ⌛    |    ⌛    |
| [RestEndpointsWithoutExposedMetrics](https://github.com/dgroup/arch4u-pmd/discussions/74)                                                              | arch4u-pmd | 0.1.0  |   ✅    |   ⌛    |    ⌛    |
| [UseConstantAsMetricName](https://github.com/dgroup/arch4u-pmd/discussions/75)                                                                         | arch4u-pmd | 0.1.0  |   ✅    |   ⌛    |    ⌛    |
| [NoMandatoryConstructorInExceptionClass](https://github.com/dgroup/arch4u-pmd/discussions/31)                                                          | arch4u-pmd | 0.1.0  |   ✅    |   ⌛    |    ⌛    |
| [AvoidUsingObjectMapperAsALocalVariable](https://github.com/dgroup/arch4u-pmd/discussions/30)                                                          | arch4u-pmd | 0.1.0  |   ✅    |   ⌛    |    ⌛    |
| [AvoidMdcOutsideTryStatement](https://github.com/dgroup/arch4u-pmd/discussions/86)                                                                     | arch4u-pmd | 0.1.0  |   ✅    |   ⌛    |    ⌛    |
| [PotentiallyThreadLocalPollutionByMdc](https://github.com/dgroup/arch4u-pmd/discussions/88)                                                            | arch4u-pmd | 0.1.0  |   ✅    |   ⌛    |    ⌛    |
| AbstractClassWithoutAbstractMethod                                                                                                                     |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| AccessorClassGeneration                                                                                                                                |  pmd-java  |  1.04  |   ✅    |   ⌛    |    ⌛    |
| AccessorMethodGeneration                                                                                                                               |  pmd-java  | 5.5.4  |   ✅    |   ⌛    |    ⌛    |
| ArrayIsStoredDirectly                                                                                                                                  |  pmd-java  |  2.2   |   ✅    |   ⌛    |    ⌛    |
| AvoidMessageDigestField                                                                                                                                |  pmd-java  | 6.18.0 |   ✅    |   ⌛    |    ⌛    |
| AvoidPrintStackTrace                                                                                                                                   |  pmd-java  |  3.2   |   ✅    |   ⌛    |    ⌛    |
| AvoidReassigningCatchVariables                                                                                                                         |  pmd-java  | 6.27.0 |   ✅    |   ⌛    |    ⌛    |
| AvoidReassigningLoopVariables                                                                                                                          |  pmd-java  | 6.11.0 |   ✅    |   ⌛    |    ⌛    |
| AvoidReassigningParameters                                                                                                                             |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| AvoidStringBufferField                                                                                                                                 |  pmd-java  |  4.2   |   ✅    |   ⌛    |    ⌛    |
| AvoidUsingHardCodedIP                                                                                                                                  |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| CheckResultSet                                                                                                                                         |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| ConstantsInInterface                                                                                                                                   |  pmd-java  |  5.5   |   ✅    |   ⌛    |    ⌛    |
| DefaultLabelNotLastInSwitchStmt                                                                                                                        |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| DoubleBraceInitialization                                                                                                                              |  pmd-java  | 6.16.0 |   ✅    |   ⌛    |    ⌛    |
| ForLoopCanBeForeach                                                                                                                                    |  pmd-java  | 6.0.0  |   ✅    |   ⌛    |    ⌛    |
| ForLoopVariableCount                                                                                                                                   |  pmd-java  | 6.11.0 |   ✅    |   ⌛    |    ⌛    |
| GuardLogStatement                                                                                                                                      |  pmd-java  | 5.1.0  |   ❌    |   ⌛    |    ⌛    |
| JUnit4SuitesShouldUseSuiteAnnotation                                                                                                                   |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| JUnit4TestShouldUseAfterAnnotation                                                                                                                     |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| JUnit4TestShouldUseBeforeAnnotation                                                                                                                    |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| JUnit4TestShouldUseTestAnnotation                                                                                                                      |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| JUnit5TestShouldBePackagePrivate                                                                                                                       |  pmd-java  | 6.35.0 |   ✅    |   ⌛    |    ⌛    |
| JUnitAssertionsShouldIncludeMessage                                                                                                                    |  pmd-java  |  1.04  |   🌵   |   ⌛    |    ⌛    |
| JUnitTestContainsTooManyAsserts                                                                                                                        |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| JUnitTestsShouldIncludeAssert                                                                                                                          |  pmd-java  |  2.0   |   ✅    |   ⌛    |    ⌛    |
| JUnitUseExpected                                                                                                                                       |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| LiteralsFirstInComparisons                                                                                                                             |  pmd-java  | 6.24.0 |   ✅    |   ⌛    |    ⌛    |
| LooseCoupling                                                                                                                                          |  pmd-java  |  0.7   |   ✅    |   ⌛    |    ⌛    |
| MethodReturnsInternalArray                                                                                                                             |  pmd-java  |  2.2   |   ✅    |   ⌛    |    ⌛    |
| MissingOverride                                                                                                                                        |  pmd-java  | 6.2.0  |   ✅    |   ⌛    |    ⌛    |
| OneDeclarationPerLine                                                                                                                                  |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| PositionLiteralsFirstInCaseInsensitiveComparisons                                                                                                      |  pmd-java  |  5.1   |   ✅    |   ⌛    |    ⌛    |
| PositionLiteralsFirstInComparisons                                                                                                                     |  pmd-java  |  3.3   |   ✅    |   ⌛    |    ⌛    |
| PreserveStackTrace                                                                                                                                     |  pmd-java  |  3.7   |   ✅    |   ⌛    |    ⌛    |
| PrimitiveWrapperInstantiation                                                                                                                          |  pmd-java  | 6.37.0 |   ✅    |   ⌛    |    ⌛    |
| ReplaceEnumerationWithIterator                                                                                                                         |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| ReplaceHashtableWithMap                                                                                                                                |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| ReplaceVectorWithList                                                                                                                                  |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| SimplifiableTestAssertion                                                                                                                              |  pmd-java  | 6.37.0 |   ✅    |   ⌛    |    ⌛    |
| SwitchStmtsShouldHaveDefault                                                                                                                           |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| SystemPrintln                                                                                                                                          |  pmd-java  |  2.1   |   ✅    |   ⌛    |    ⌛    |
| UnusedAssignment                                                                                                                                       |  pmd-java  | 6.26.0 |   ✅    |   ⌛    |    ⌛    |
| UnusedFormalParameter                                                                                                                                  |  pmd-java  |  0.8   |   ✅    |   ⌛    |    ⌛    |
| UnusedImports                                                                                                                                          |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| UnusedLocalVariable                                                                                                                                    |  pmd-java  |  0.1   |   ✅    |   ⌛    |    ⌛    |
| UnusedPrivateField                                                                                                                                     |  pmd-java  |  0.1   |   ✅    |   ⌛    |    ⌛    |
| UnusedPrivateMethod                                                                                                                                    |  pmd-java  |  0.7   |   🌵   |   ⌛    |    ⌛    |
| UseAssertEqualsInsteadOfAssertTrue                                                                                                                     |  pmd-java  |  3.1   |   ✅    |   ⌛    |    ⌛    |
| UseAssertNullInsteadOfAssertTrue                                                                                                                       |  pmd-java  |  3.5   |   ✅    |   ⌛    |    ⌛    |
| UseAssertSameInsteadOfAssertTrue                                                                                                                       |  pmd-java  |  3.1   |   ✅    |   ⌛    |    ⌛    |
| UseAssertTrueInsteadOfAssertEquals                                                                                                                     |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| UseCollectionIsEmpty                                                                                                                                   |  pmd-java  |  3.9   |   ✅    |   ⌛    |    ⌛    |
| UseVarargs                                                                                                                                             |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| AbstractNaming                                                                                                                                         |  pmd-java  |  1.4   |   ✅    |   ⌛    |    ⌛    |
| AtLeastOneConstructor                                                                                                                                  |  pmd-java  |  1.04  |   🌵   |   ✅    |    ⌛    |
| AvoidDollarSigns                                                                                                                                       |  pmd-java  |  1.4   |   ✅    |   ⌛    |    ⌛    |
| AvoidFinalLocalVariable                                                                                                                                |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| AvoidPrefixingMethodParameters                                                                                                                         |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| AvoidProtectedFieldInFinalClass                                                                                                                        |  pmd-java  |  2.1   |   ✅    |   ⌛    |    ⌛    |
| AvoidProtectedMethodInFinalClassNotExtending                                                                                                           |  pmd-java  |  5.1   |   ✅    |   ⌛    |    ⌛    |
| AvoidUsingNativeCode                                                                                                                                   |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| BooleanGetMethodName                                                                                                                                   |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| CallSuperInConstructor                                                                                                                                 |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| ClassNamingConventions                                                                                                                                 |  pmd-java  |  1.2   |   ✅    |   ⌛    |    ⌛    |
| CommentDefaultAccessModifier                                                                                                                           |  pmd-java  | 5.4.0  |   ✅    |   ⌛    |    ⌛    |
| ConfusingTernary                                                                                                                                       |  pmd-java  |  1.9   |   ✅    |   ⌛    |    ⌛    |
| ControlStatementBraces                                                                                                                                 |  pmd-java  | 6.2.0  |   ✅    |   ⌛    |    ⌛    |
| DefaultPackage                                                                                                                                         |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| DontImportJavaLang                                                                                                                                     |  pmd-java  |  0.5   |   ✅    |   ⌛    |    ⌛    |
| DuplicateImports                                                                                                                                       |  pmd-java  |  0.5   |   ✅    |   ⌛    |    ⌛    |
| EmptyMethodInAbstractClassShouldBeAbstract                                                                                                             |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| ExtendsObject                                                                                                                                          |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| FieldDeclarationsShouldBeAtStartOfClass                                                                                                                |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| ForLoopShouldBeWhileLoop                                                                                                                               |  pmd-java  |  1.02  |   ✅    |   ⌛    |    ⌛    |
| ForLoopsMustUseBraces                                                                                                                                  |  pmd-java  |  0.7   |   ✅    |   ⌛    |    ⌛    |
| GenericsNaming                                                                                                                                         |  pmd-java  | 4.2.6  |   ✅    |   ⌛    |    ⌛    |
| FormalParameterNamingConventions                                                                                                                       |  pmd-java  | 6.4.0  |   ✅    |   ⌛    |    ⌛    |
| IfElseStmtsMustUseBraces                                                                                                                               |  pmd-java  |  0.2   |   ✅    |   ⌛    |    ⌛    |
| IfStmtsMustUseBraces                                                                                                                                   |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| LocalHomeNamingConvention                                                                                                                              |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| IdenticalCatchBranches                                                                                                                                 |  pmd-java  | 6.4.0  |   ✅    |   ⌛    |    ⌛    |
| LinguisticNaming                                                                                                                                       |  pmd-java  | 6.7.0  |   ✅    |   ⌛    |    ⌛    |
| LocalInterfaceSessionNamingConvention                                                                                                                  |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| LocalVariableCouldBeFinal                                                                                                                              |  pmd-java  |  2.2   |   ✅    |   ⌛    |    ⌛    |
| LocalVariableNamingConventions                                                                                                                         |  pmd-java  | 6.6.0  |   ✅    |   ⌛    |    ⌛    |
| LongVariable                                                                                                                                           |  pmd-java  |  0.3   |   ✅    |   ⌛    |    ⌛    |
| MDBAndSessionBeanNamingConvention                                                                                                                      |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| MethodArgumentCouldBeFinal                                                                                                                             |  pmd-java  |  2.2   |   ✅    |   ⌛    |    ⌛    |
| MethodNamingConventions                                                                                                                                |  pmd-java  |  1.2   |   ✅    |   ⌛    |    ⌛    |
| MIsLeadingVariableName                                                                                                                                 |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| NoPackage                                                                                                                                              |  pmd-java  |  3.3   |   ✅    |   ⌛    |    ⌛    |
| UseUnderscoresInNumericLiterals                                                                                                                        |  pmd-java  | 6.10.0 |   ✅    |   ⌛    |    ⌛    |
| OnlyOneReturn                                                                                                                                          |  pmd-java  | 6.10.0 |   🌵   |   ⌛    |    ⌛    |
| PackageCase                                                                                                                                            |  pmd-java  |  3.3   |   ✅    |   ⌛    |    ⌛    |
| PrematureDeclaration                                                                                                                                   |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| RemoteInterfaceNamingConvention                                                                                                                        |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| RemoteSessionInterfaceNamingConvention                                                                                                                 |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| ShortClassName                                                                                                                                         |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| ShortMethodName                                                                                                                                        |  pmd-java  |  0.3   |   ✅    |   ⌛    |    ⌛    |
| ShortVariable                                                                                                                                          |  pmd-java  |  0.3   |   ✅    |   ⌛    |    ⌛    |
| SuspiciousConstantFieldName                                                                                                                            |  pmd-java  |  2.0   |   ✅    |   ⌛    |    ⌛    |
| TooManyStaticImports                                                                                                                                   |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| UnnecessaryAnnotationValueElement                                                                                                                      |  pmd-java  | 6.2.0  |   ✅    |   ⌛    |    ⌛    |
| UnnecessaryCast                                                                                                                                        |  pmd-java  | 6.24.0 |   ✅    |   ⌛    |    ⌛    |
| UnnecessaryConstructor                                                                                                                                 |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| UnnecessaryFullyQualifiedName                                                                                                                          |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| UnnecessaryImport                                                                                                                                      |  pmd-java  | 6.34.0 |   ✅    |   ⌛    |    ⌛    |
| UnnecessaryLocalBeforeReturn                                                                                                                           |  pmd-java  |  3.3   |   ✅    |   ⌛    |    ⌛    |
| UnnecessaryModifier                                                                                                                                    |  pmd-java  |  1.02  |   ✅    |   ⌛    |    ⌛    |
| UnnecessaryReturn                                                                                                                                      |  pmd-java  |  1.3   |   ✅    |   ⌛    |    ⌛    |
| UseDiamondOperator                                                                                                                                     |  pmd-java  | 6.11.0 |   ✅    |   ⌛    |    ⌛    |
| UselessParentheses                                                                                                                                     |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| UselessQualifiedThis                                                                                                                                   |  pmd-java  | 5.4.0  |   ✅    |   ⌛    |    ⌛    |
| UseShortArrayInitializer                                                                                                                               |  pmd-java  | 6.15.0 |   ✅    |   ⌛    |    ⌛    |
| VariableNamingConventions                                                                                                                              |  pmd-java  |  1.2   |   ✅    |   ⌛    |    ⌛    |
| WhileLoopsMustUseBraces                                                                                                                                |  pmd-java  |  0.7   |   ✅    |   ⌛    |    ⌛    |
| [AddEmptyString](https://pmd.github.io/latest/pmd_rules_java_performance.html#addemptystring)                                                          |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| [AppendCharacterWithChar](https://pmd.github.io/latest/pmd_rules_java_performance.html#appendcharacterwithchar)                                        |  pmd-java  |  3.5   |   ✅    |   ⌛    |    ⌛    |
| [AvoidArrayLoops](https://pmd.github.io/latest/pmd_rules_java_performance.html#avoidarrayloops)                                                        |  pmd-java  |  3.5   |   ✅    |   ⌛    |    ⌛    |
| [AvoidCalendarDateCreation](https://pmd.github.io/latest/pmd_rules_java_performance.html#avoidcalendardatecreation)                                    |  pmd-java  | 6.25.0 |   ✅    |   ⌛    |    ⌛    |
| [AvoidFileStream](https://pmd.github.io/latest/pmd_rules_java_performance.html#avoidfilestream)                                                        |  pmd-java  | 6.0.0  |   ✅    |   ⌛    |    ⌛    |
| [AvoidInstantiatingObjectsInLoops](https://pmd.github.io/latest/pmd_rules_java_performance.html#avoidinstantiatingobjectsinloops)                      |  pmd-java  |  2.2   |   ✅    |   ⌛    |    ⌛    |
| [AvoidUsingShortType](https://pmd.github.io/latest/pmd_rules_java_performance.html#avoidusingshorttype)                                                |  pmd-java  |  4.1   |   ❌    |   ⌛    |    ⌛    |
| [BigIntegerInstantiation](https://pmd.github.io/latest/pmd_rules_java_performance.html#bigintegerinstantiation)                                        |  pmd-java  |  3.9   |   ✅    |   ⌛    |    ⌛    |
| [BooleanInstantiation](https://pmd.github.io/latest/pmd_rules_java_performance.html#booleaninstantiation)                                              |  pmd-java  |  1.2   |   ❌    |   ⌛    |    ⌛    |
| [ByteInstantiation](https://pmd.github.io/latest/pmd_rules_java_performance.html#byteinstantiation)                                                    |  pmd-java  |  4.0   |   ❌    |   ⌛    |    ⌛    |
| [ConsecutiveAppendsShouldReuse](https://pmd.github.io/latest/pmd_rules_java_performance.html#consecutiveappendsshouldreuse)                            |  pmd-java  |  5.1   |   ✅    |   ⌛    |    ⌛    |
| [ConsecutiveLiteralAppends](https://pmd.github.io/latest/pmd_rules_java_performance.html#consecutiveliteralappends)                                    |  pmd-java  |  3.5   |   ✅    |   ⌛    |    ⌛    |
| [InefficientEmptyStringCheck](https://pmd.github.io/latest/pmd_rules_java_performance.html#inefficientemptystringcheck)                                |  pmd-java  |  3.6   |   ✅    |   ⌛    |    ⌛    |
| [InefficientStringBuffering](https://pmd.github.io/latest/pmd_rules_java_performance.html#inefficientstringbuffering)                                  |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| [InsufficientStringBufferDeclaration](https://pmd.github.io/latest/pmd_rules_java_performance.html#insufficientstringbufferdeclaration)                |  pmd-java  |  3.6   |   ✅    |   ⌛    |    ⌛    |
| [IntegerInstantiation](https://pmd.github.io/latest/pmd_rules_java_performance.html#integerinstantiation)                                              |  pmd-java  |  3.5   |   ❌    |   ⌛    |    ⌛    |
| [LongInstantiation](https://pmd.github.io/latest/pmd_rules_java_performance.html#longinstantiation)                                                    |  pmd-java  |  4.0   |   ❌    |   ⌛    |    ⌛    |
| [OptimizableToArrayCall](https://pmd.github.io/latest/pmd_rules_java_performance.html#optimizabletoarraycall)                                          |  pmd-java  |  1.8   |   ✅    |   ⌛    |    ⌛    |
| [RedundantFieldInitializer](https://pmd.github.io/latest/pmd_rules_java_performance.html#redundantfieldinitializer)                                    |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| [ShortInstantiation](https://pmd.github.io/latest/pmd_rules_java_performance.html#shortinstantiation)                                                  |  pmd-java  |  4.0   |   ❌    |   ⌛    |    ⌛    |
| [SimplifyStartsWith](https://pmd.github.io/latest/pmd_rules_java_performance.html#simplifystartswith)                                                  |  pmd-java  |  3.1   |   ✅    |   ⌛    |    ⌛    |
| [StringInstantiation](https://pmd.github.io/latest/pmd_rules_java_performance.html#stringinstantiation)                                                |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| [StringToString](https://pmd.github.io/latest/pmd_rules_java_performance.html#stringtostring)                                                          |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| [TooFewBranchesForASwitchStatement](https://pmd.github.io/latest/pmd_rules_java_performance.html#toofewbranchesforaswitchstatement)                    |  pmd-java  |  4.2   |   ✅    |   ⌛    |    ⌛    |
| [UnnecessaryWrapperObjectCreation](https://pmd.github.io/latest/pmd_rules_java_performance.html#unnecessarywrapperobjectcreation)                      |  pmd-java  |  3.8   |   ✅    |   ⌛    |    ⌛    |
| [UseArrayListInsteadOfVector](https://pmd.github.io/latest/pmd_rules_java_performance.html#usearraylistinsteadofvector)                                |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [UseArraysAsList](https://pmd.github.io/latest/pmd_rules_java_performance.html#usearraysaslist)                                                        |  pmd-java  |  3.5   |   ✅    |   ⌛    |    ⌛    |
| [UseIndexOfChar](https://pmd.github.io/latest/pmd_rules_java_performance.html#useindexofchar)                                                          |  pmd-java  |  3.5   |   ✅    |   ⌛    |    ⌛    |
| [UseIOStreamsWithApacheCommonsFileItem](https://pmd.github.io/latest/pmd_rules_java_performance.html#useiostreamswithapachecommonsfileitem)            |  pmd-java  | 6.25.0 |   ✅    |   ⌛    |    ⌛    |
| [UselessStringValueOf](https://pmd.github.io/latest/pmd_rules_java_performance.html#uselessstringvalueof)                                              |  pmd-java  |  3.8   |   ✅    |   ⌛    |    ⌛    |
| [UseStringBufferForStringAppends](https://pmd.github.io/latest/pmd_rules_java_performance.html#usestringbufferforstringappends)                        |  pmd-java  |  3.1   |   ✅    |   ⌛    |    ⌛    |
| [UseStringBufferLength](https://pmd.github.io/latest/pmd_rules_java_performance.html#usestringbufferlength)                                            |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| [AvoidSynchronizedAtMethodLevel](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#avoidsynchronizedatmethodlevel)                       |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [AvoidThreadGroup](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#avoidthreadgroup)                                                   |  pmd-java  |  3.6   |   ✅    |   ⌛    |    ⌛    |
| [AvoidUsingVolatile](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#avoidusingvolatile)                                               |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [DoNotUseThreads](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#donotusethreads)                                                     |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| [DontCallThreadRun](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#dontcallthreadrun)                                                 |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [DoubleCheckedLocking](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#doublecheckedlocking)                                           |  pmd-java  |  1.04  |   ✅    |   ⌛    |    ⌛    |
| [NonThreadSafeSingleton](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#nonthreadsafesingleton)                                       |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| [UnsynchronizedStaticDateFormatter](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#unsynchronizedstaticdateformatter)                 |  pmd-java  |  3.6   |   ❌    |   ⌛    |    ⌛    |
| [UnsynchronizedStaticFormatter](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#unsynchronizedstaticformatter)                         |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [UseConcurrentHashMap](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#unsynchronizedstaticformatter)                                  |  pmd-java  | 4.2.6  |   ❌    |   ⌛    |    ⌛    |
| [UseNotifyAllInsteadOfNotify](https://pmd.github.io/latest/pmd_rules_java_multithreading.html#usenotifyallinsteadofnotify)                             |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [CommentContent](https://pmd.github.io/latest/pmd_rules_java_documentation.html#ntcontent)                                                             |  pmd-java  |  5.0   |   ❌    |   ⌛    |    ⌛    |
| [CommentRequired](https://pmd.github.io/latest/pmd_rules_java_documentation.html#commentrequired)                                                      |  pmd-java  |  5.1   |   🌵   |   ⌛    |    ⌛    |
| [UncommentedEmptyConstructor](https://pmd.github.io/latest/pmd_rules_java_documentation.html#uncommentedemptyconstructor)                              |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| [UncommentedEmptyMethodBody](https://pmd.github.io/latest/pmd_rules_java_documentation.html#uncommentedemptymethodbody)                                |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| [AbstractClassWithoutAnyMethod](https://pmd.github.io/latest/pmd_rules_java_design.html#abstractclasswithoutanymethod)                                 |  pmd-java  |  4.2   |   ✅    |   ⌛    |    ⌛    |
| [AvoidCatchingGenericException](https://pmd.github.io/latest/pmd_rules_java_design.html#avoidcatchinggenericexception)                                 |  pmd-java  | 4.2.6  |   ❌    |   ⌛    |    ⌛    |
| [AvoidDeeplyNestedIfStmts](https://pmd.github.io/latest/pmd_rules_java_design.html#avoiddeeplynestedifstmts)                                           |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| [AvoidRethrowingException](https://pmd.github.io/latest/pmd_rules_java_design.html#avoidrethrowingexception)                                           |  pmd-java  |  3.8   |   ✅    |   ⌛    |    ⌛    |
| [AvoidThrowingNewInstanceOfSameException](https://pmd.github.io/latest/pmd_rules_java_design.html#avoidthrowingnewinstanceofsameexception)             |  pmd-java  | 4.2.5  |   ✅    |   ⌛    |    ⌛    |
| [AvoidThrowingNullPointerException](https://pmd.github.io/latest/pmd_rules_java_design.html#avoidthrowingnullpointerexception)                         |  pmd-java  |  1.8   |   ✅    |   ⌛    |    ⌛    |
| [AvoidThrowingRawExceptionTypes](https://pmd.github.io/latest/pmd_rules_java_design.html#avoidthrowingrawexceptiontypes)                               |  pmd-java  |  1.8   |   ✅    |   ⌛    |    ⌛    |
| [AvoidUncheckedExceptionsInSignatures](https://pmd.github.io/latest/pmd_rules_java_design.html#avoiduncheckedexceptionsinsignatures)                   |  pmd-java  | 6.13.0 |   ✅    |   ⌛    |    ⌛    |
| [ClassWithOnlyPrivateConstructorsShouldBeFinal](https://pmd.github.io/latest/pmd_rules_java_design.html#classwithonlyprivateconstructorsshouldbefinal) |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| [CollapsibleIfStatements](https://pmd.github.io/latest/pmd_rules_java_design.html#collapsibleifstatements)                                             |  pmd-java  |  3.1   |   ✅    |   ⌛    |    ⌛    |
| [CouplingBetweenObjects](https://pmd.github.io/latest/pmd_rules_java_design.html#couplingbetweenobjects)                                               |  pmd-java  | 1.0.4  |   🌵   |   ⌛    |    ⌛    |
| [CognitiveComplexity](https://pmd.github.io/latest/pmd_rules_java_design.html#cognitivecomplexity)                                                     |  pmd-java  | 6.35.0 |   ✅    |   ⌛    |    ⌛    |
| [CyclomaticComplexity](https://pmd.github.io/latest/pmd_rules_java_design.html#cyclomaticcomplexity)                                                   |  pmd-java  |  1.03  |   ✅    |   ⌛    |    ⌛    |
| [DataClass](https://pmd.github.io/latest/pmd_rules_java_design.html#dataclass)                                                                         |  pmd-java  | 6.0.0  |   ✅    |   ⌛    |    ⌛    |
| [DoNotExtendJavaLangError](https://pmd.github.io/latest/pmd_rules_java_design.html#donotextendjavalangerror)                                           |  pmd-java  |  4.0   |   ✅    |   ⌛    |    ⌛    |
| [ExceptionAsFlowControl](https://pmd.github.io/latest/pmd_rules_java_design.html#exceptionasflowcontrol)                                               |  pmd-java  |  1.8   |   ✅    |   ⌛    |    ⌛    |
| [ExcessiveClassLength](https://pmd.github.io/latest/pmd_rules_java_design.html#excessiveclasslength)                                                   |  pmd-java  |  0.6   |   ✅    |   ⌛    |    ⌛    |
| [ExcessiveImports](https://pmd.github.io/latest/pmd_rules_java_design.html#excessiveimports)                                                           |  pmd-java  |  1.04  |   ✅    |   ⌛    |    ⌛    |
| [ExcessiveMethodLength](https://pmd.github.io/latest/pmd_rules_java_design.html#excessivemethodlength)                                                 |  pmd-java  |  0.6   |   ✅    |   ⌛    |    ⌛    |
| [ExcessiveParameterList](https://pmd.github.io/latest/pmd_rules_java_design.html#excessiveparameterlist)                                               |  pmd-java  |  0.9   |   ✅    |   ⌛    |    ⌛    |
| [ExcessivePublicCount](https://pmd.github.io/latest/pmd_rules_java_design.html#excessivepubliccount)                                                   |  pmd-java  |  1.04  |   ✅    |   ⌛    |    ⌛    |
| [FinalFieldCouldBeStatic](https://pmd.github.io/latest/pmd_rules_java_design.html#finalfieldcouldbestatic)                                             |  pmd-java  |  1.1   |   ✅    |   ⌛    |    ⌛    |
| [GodClass](https://pmd.github.io/latest/pmd_rules_java_design.html#godclass)                                                                           |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| [ImmutableField](https://pmd.github.io/latest/pmd_rules_java_design.html#immutablefield)                                                               |  pmd-java  |  2.0   |   ✅    |   ⌛    |    ⌛    |
| [LawOfDemeter](https://pmd.github.io/latest/pmd_rules_java_design.html#lawofdemeter)                                                                   |  pmd-java  |  5.0   |   ❌    |   ⌛    |    ⌛    |
| [LogicInversion](https://pmd.github.io/latest/pmd_rules_java_design.html#logicinversion)                                                               |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| [LoosePackageCoupling](https://pmd.github.io/latest/pmd_rules_java_design.html#loosepackagecoupling)                                                   |  pmd-java  |  5.0   |   ❌    |   ⌛    |    ⌛    |
| [ModifiedCyclomaticComplexity](https://pmd.github.io/latest/pmd_rules_java_design.html#modifiedcyclomaticcomplexity)                                   |  pmd-java  | 5.1.2  |   ✅    |   ⌛    |    ⌛    |
| [NcssConstructorCount](https://pmd.github.io/latest/pmd_rules_java_design.html#ncssconstructorcount)                                                   |  pmd-java  |  3.9   |   ✅    |   ⌛    |    ⌛    |
| [NcssCount](https://pmd.github.io/latest/pmd_rules_java_design.html#ncsscount)                                                                         |  pmd-java  | 6.0.0  |   ✅    |   ⌛    |    ⌛    |
| [NcssMethodCount](https://pmd.github.io/latest/pmd_rules_java_design.html#ncssmethodcount)                                                             |  pmd-java  |  3.9   |   ✅    |   ⌛    |    ⌛    |
| [NcssTypeCount](https://pmd.github.io/latest/pmd_rules_java_design.html#ncsstypecount)                                                                 |  pmd-java  |  3.9   |   ✅    |   ⌛    |    ⌛    |
| [NPathComplexity](https://pmd.github.io/latest/pmd_rules_java_design.html#npathcomplexity)                                                             |  pmd-java  |  3.9   |   ✅    |   ⌛    |    ⌛    |
| [SignatureDeclareThrowsException](https://pmd.github.io/latest/pmd_rules_java_design.html#signaturedeclarethrowsexception)                             |  pmd-java  |  1.2   |   ❌    |   ⌛    |    ⌛    |
| [SimplifiedTernary](https://pmd.github.io/latest/pmd_rules_java_design.html#simplifiedternary)                                                         |  pmd-java  | 5.4.0  |   ✅    |   ⌛    |    ⌛    |
| [SimplifyBooleanAssertion](https://pmd.github.io/latest/pmd_rules_java_design.html#simplifybooleanassertion)                                           |  pmd-java  |  3.6   |   ✅    |   ⌛    |    ⌛    |
| [SimplifyBooleanExpressions](https://pmd.github.io/latest/pmd_rules_java_design.html#simplifybooleanexpressions)                                       |  pmd-java  |  1.05  |   ✅    |   ⌛    |    ⌛    |
| [SimplifyBooleanReturns](https://pmd.github.io/latest/pmd_rules_java_design.html#simplifybooleanreturns)                                               |  pmd-java  |  0.9   |   ✅    |   ⌛    |    ⌛    |
| [SimplifyConditional](https://pmd.github.io/latest/pmd_rules_java_design.html#simplifyconditional)                                                     |  pmd-java  |  3.1   |   ✅    |   ⌛    |    ⌛    |
| [SingularField](https://pmd.github.io/latest/pmd_rules_java_design.html#singularfield)                                                                 |  pmd-java  |  3.1   |   ✅    |   ⌛    |    ⌛    |
| [StdCyclomaticComplexity](https://pmd.github.io/latest/pmd_rules_java_design.html#singularfield)                                                       |  pmd-java  | 5.1.2  |   ❌    |   ⌛    |    ⌛    |
| [SwitchDensity](https://pmd.github.io/latest/pmd_rules_java_design.html#switchdensity)                                                                 |  pmd-java  |  1.02  |   ✅    |   ⌛    |    ⌛    |
| [TooManyFields](https://pmd.github.io/latest/pmd_rules_java_design.html#toomanyfields)                                                                 |  pmd-java  |  3.0   |   🌵   |   ⌛    |    ⌛    |
| [TooManyMethods](https://pmd.github.io/latest/pmd_rules_java_design.html#toomanymethods)                                                               |  pmd-java  |  4.2   |   🌵   |   ⌛    |    ⌛    |
| [UselessOverridingMethod](https://pmd.github.io/latest/pmd_rules_java_design.html#uselessoverridingmethod)                                             |  pmd-java  |  3.3   |   ✅    |   ⌛    |    ⌛    |
| [UseObjectForClearerAPI](https://pmd.github.io/latest/pmd_rules_java_design.html#useobjectforclearerapi)                                               |  pmd-java  | 4.2.6  |   ❌    |   ⌛    |    ⌛    |
| [UseUtilityClass](https://pmd.github.io/latest/pmd_rules_java_design.html#useutilityclass)                                                             |  pmd-java  |  0.3   |   ✅    |   ⌛    |    ⌛    |
| [MutableStaticState](https://pmd.github.io/latest/pmd_rules_java_design.html#mutablestaticstate)                                                       |  pmd-java  | 6.35.0 |   ✅    |   ⌛    |    ⌛    |
| [AssignmentInOperand](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#assignmentinoperand)                                                 |  pmd-java  |  1.03  |   ✅    |   ⌛    |    ⌛    |
| [AssignmentToNonFinalStatic](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#assignmenttononfinalstatic)                                   |  pmd-java  |  2.2   |   ✅    |   ⌛    |    ⌛    |
| [AvoidAccessibilityAlteration](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidaccessibilityalteration)                               |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| [AvoidAssertAsIdentifier](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidassertasidentifier)                                         |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| [AvoidBranchingStatementAsLastInLoop](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidbranchingstatementaslastinloop)                 |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| [AvoidCallingFinalize](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidcallingfinalize)                                               |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [AvoidCatchingNPE](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidcatchingnpe)                                                       |  pmd-java  |  1.8   |   ✅    |   ⌛    |    ⌛    |
| [AvoidCatchingThrowable](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidcatchingthrowable)                                           |  pmd-java  |  1.2   |   ✅    |   ⌛    |    ⌛    |
| [AvoidDecimalLiteralsInBigDecimalConstructor](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoiddecimalliteralsinbigdecimalconstructor) |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| [AvoidDuplicateLiterals](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidduplicateliterals)                                           |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| [AvoidEnumAsIdentifier](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidenumasidentifier)                                             |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| [AvoidFieldNameMatchingMethodName](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidfieldnamematchingmethodname)                       |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [AvoidFieldNameMatchingTypeName](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidfieldnamematchingtypename)                           |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [AvoidInstanceofChecksInCatchClause](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidinstanceofchecksincatchclause)                   |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [AvoidLiteralsInIfCondition](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidliteralsinifcondition)                                   |  pmd-java  | 4.2.6  |   ✅    |   ⌛    |    ⌛    |
| [AvoidLosingExceptionInformation](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidlosingexceptioninformation)                         |  pmd-java  | 4.2.6  |   ✅    |   ⌛    |    ⌛    |
| [AvoidMultipleUnaryOperators](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidmultipleunaryoperators)                                 |  pmd-java  |  4.2   |   ✅    |   ⌛    |    ⌛    |
| [AvoidUsingOctalValues](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#avoidusingoctalvalues)                                             |  pmd-java  |  3.9   |   ✅    |   ⌛    |    ⌛    |
| [BadComparison](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#badcomparison)                                                             |  pmd-java  | 6.36.0 |   ❌    |   ⌛    |    ⌛    |
| [BeanMembersShouldSerialize](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#beanmembersshouldserialize)                                   |  pmd-java  |  1.1   |   ✅    |   ⌛    |    ⌛    |
| [BrokenNullCheck](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#brokennullcheck)                                                         |  pmd-java  |  3.8   |   ✅    |   ⌛    |    ⌛    |
| [CallSuperFirst](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#callsuperfirst)                                                           |  pmd-java  | 4.2.5  |   ✅    |   ⌛    |    ⌛    |
| [CallSuperLast](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#callsuperlast)                                                             |  pmd-java  | 4.2.5  |   ✅    |   ⌛    |    ⌛    |
| [CheckSkipResult](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#checkskipresult)                                                         |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| [ClassCastExceptionWithToArray](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#classcastexceptionwithtoarray)                             |  pmd-java  |  3.4   |   ✅    |   ⌛    |    ⌛    |
| [CloneMethodMustBePublic](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#clonemethodmustbepublic)                                         |  pmd-java  | 5.4.0  |   ✅    |   ⌛    |    ⌛    |
| [CloneMethodMustImplementCloneable](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#clonemethodmustimplementcloneable)                     |  pmd-java  |  1.9   |   ✅    |   ⌛    |    ⌛    |
| [CloneMethodReturnTypeMustMatchClassName](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#clonemethodreturntypemustmatchclassname)         |  pmd-java  | 5.4.0  |   ✅    |   ⌛    |    ⌛    |
| [CloneThrowsCloneNotSupportedException](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#clonethrowsclonenotsupportedexception)             |  pmd-java  |  1.9   |   ✅    |   ⌛    |    ⌛    |
| [CloseResource](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#closeresource)                                                             |  pmd-java  | 1.2.2  |   ✅    |   ⌛    |    ⌛    |
| [CompareObjectsWithEquals](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#compareobjectswithequals)                                       |  pmd-java  |  3.2   |   ✅    |   ⌛    |    ⌛    |
| [ComparisonWithNaN](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#comparisonwithnan)                                                     |  pmd-java  | 6.36.0 |   ✅    |   ⌛    |    ⌛    |
| [ConstructorCallsOverridableMethod](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#constructorcallsoverridablemethod)                     |  pmd-java  |  1.04  |   ✅    |   ⌛    |    ⌛    |
| [DataflowAnomalyAnalysis](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#dataflowanomalyanalysis)                                         |  pmd-java  |  3.9   |   ❌    |   ⌛    |    ⌛    |
| [DetachedTestCase](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#detachedtestcase)                                                       |  pmd-java  | 6.13.0 |   ✅    |   ⌛    |    ⌛    |
| [DoNotCallGarbageCollectionExplicitly](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#donotcallgarbagecollectionexplicitly)               |  pmd-java  |  4.2   |   ✅    |   ⌛    |    ⌛    |
| [DoNotCallSystemExit](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#donotcallsystemexit)                                                 |  pmd-java  |  4.1   |   ❌    |   ⌛    |    ⌛    |
| [DoNotExtendJavaLangThrowable](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#donotextendjavalangthrowable)                               |  pmd-java  | 6.0.0  |   ✅    |   ⌛    |    ⌛    |
| [DoNotHardCodeSDCard](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#donothardcodesdcard)                                                 |  pmd-java  | 4.2.6  |   ✅    |   ⌛    |    ⌛    |
| [DoNotTerminateVM](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#donotterminatevm)                                                       |  pmd-java  |  4.2   |   ✅    |   ⌛    |    ⌛    |
| [DoNotThrowExceptionInFinally](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#donotthrowexceptioninfinally)                               |  pmd-java  |  4.2   |   ✅    |   ⌛    |    ⌛    |
| [DontImportSun](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#dontimportsun)                                                             |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [DontUseFloatTypeForLoopIndices](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#dontusefloattypeforloopindices)                           |  pmd-java  |  4.3   |   ✅    |   ⌛    |    ⌛    |
| [EmptyCatchBlock](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptycatchblock)                                                         |  pmd-java  |  0.1   |   ✅    |   ⌛    |    ⌛    |
| [EmptyFinalizer](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptyfinalizer)                                                           |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [EmptyFinallyBlock](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptyfinallyblock)                                                     |  pmd-java  |  0.4   |   ✅    |   ⌛    |    ⌛    |
| [EmptyIfStmt](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptyifstmt)                                                                 |  pmd-java  |  0.1   |   ✅    |   ⌛    |    ⌛    |
| [EmptyInitializer](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptyinitializer)                                                       |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| [EmptyStatementBlock](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptystatementblock)                                                 |  pmd-java  |  5.0   |   ✅    |   ⌛    |    ⌛    |
| [EmptyStatementNotInLoop](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptystatementnotinloop)                                         |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [EmptySwitchStatements](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptyswitchstatements)                                             |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| [EmptySynchronizedBlock](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptysynchronizedblock)                                           |  pmd-java  |  1.3   |   ✅    |   ⌛    |    ⌛    |
| [EmptyTryBlock](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptytryblock)                                                             |  pmd-java  |  0.4   |   ✅    |   ⌛    |    ⌛    |
| [EmptyWhileStmt](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#emptywhilestmt)                                                           |  pmd-java  |  0.2   |   ✅    |   ⌛    |    ⌛    |
| [EqualsNull](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#equalsnull)                                                                   |  pmd-java  |  1.9   |   ✅    |   ⌛    |    ⌛    |
| [FinalizeDoesNotCallSuperFinalize](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#finalizedoesnotcallsuperfinalize)                       |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [FinalizeOnlyCallsSuperFinalize](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#finalizeonlycallssuperfinalize)                           |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [FinalizeOverloaded](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#finalizeoverloaded)                                                   |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [FinalizeShouldBeProtected](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#finalizeshouldbeprotected)                                     |  pmd-java  |  1.1   |   ✅    |   ⌛    |    ⌛    |
| [IdempotentOperations](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#idempotentoperations)                                               |  pmd-java  |  2.0   |   ✅    |   ⌛    |    ⌛    |
| [ImplicitSwitchFallThrough](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#implicitswitchfallthrough)                                     |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [ImportFromSamePackage](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#importfromsamepackage)                                             |  pmd-java  |  1.02  |   ❌    |   ⌛    |    ⌛    |
| [InstantiationToGetClass](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#instantiationtogetclass)                                         |  pmd-java  |  2.0   |   ✅    |   ⌛    |    ⌛    |
| [InvalidLogMessageFormat](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#invalidlogmessageformat)                                         |  pmd-java  | 5.5.0  |   ✅    |   ⌛    |    ⌛    |
| [InvalidSlf4jMessageFormat](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#invalidslf4jmessageformat)                                     |  pmd-java  | 5.5.0  |   ❌    |   ⌛    |    ⌛    |
| [JumbledIncrementer](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#jumbledincrementer)                                                   |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| [JUnitSpelling](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#junitspelling)                                                             |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| [JUnitStaticSuite](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#junitstaticsuite)                                                       |  pmd-java  |  1.0   |   ✅    |   ⌛    |    ⌛    |
| [LoggerIsNotStaticFinal](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#loggerisnotstaticfinal)                                           |  pmd-java  |  2.0   |   ❌    |   ⌛    |    ⌛    |
| [MethodWithSameNameAsEnclosingClass](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#methodwithsamenameasenclosingclass)                   |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [MisplacedNullCheck](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#misplacednullcheck)                                                   |  pmd-java  |  3.5   |   ✅    |   ⌛    |    ⌛    |
| [MissingBreakInSwitch](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#missingbreakinswitch)                                               |  pmd-java  |  3.0   |   ❌    |   ⌛    |    ⌛    |
| [MissingSerialVersionUID](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#missingserialversionuid)                                         |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [MissingStaticMethodInNonInstantiatableClass](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#missingstaticmethodinnoninstantiatableclass) |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [MoreThanOneLogger](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#morethanonelogger)                                                     |  pmd-java  |  2.0   |   ✅    |   ⌛    |    ⌛    |
| [NonCaseLabelInSwitchStatement](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#noncaselabelinswitchstatement)                             |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [NonStaticInitializer](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#nonstaticinitializer)                                               |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [NullAssignment](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#nullassignment)                                                           |  pmd-java  |  1.02  |   ✅    |   ⌛    |    ⌛    |
| [OverrideBothEqualsAndHashcode](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#overridebothequalsandhashcode)                             |  pmd-java  |  0.4   |   ✅    |   ⌛    |    ⌛    |
| [ProperCloneImplementation](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#propercloneimplementation)                                     |  pmd-java  |  1.4   |   ✅    |   ⌛    |    ⌛    |
| [ProperLogger](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#properlogger)                                                               |  pmd-java  |  3.3   |   ✅    |   ⌛    |    ⌛    |
| [ReturnEmptyArrayRatherThanNull](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#returnemptyarrayratherthannull)                           |  pmd-java  |  4.2   |   ❌    |   ⌛    |    ⌛    |
| [ReturnEmptyCollectionRatherThanNull](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#returnemptycollectionratherthannull)                 |  pmd-java  | 6.37.0 |   ✅    |   ⌛    |    ⌛    |
| [ReturnFromFinallyBlock](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#returnfromfinallyblock)                                           |  pmd-java  |  1.05  |   ✅    |   ⌛    |    ⌛    |
| [SimpleDateFormatNeedsLocale](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#simpledateformatneedslocale)                                 |  pmd-java  |  2.0   |   ✅    |   ⌛    |    ⌛    |
| [SingleMethodSingleton](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#singlemethodsingleton)                                             |  pmd-java  |  5.4   |   ✅    |   ⌛    |    ⌛    |
| [SingletonClassReturningNewInstance](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#singletonclassreturningnewinstance)                   |  pmd-java  |  5.4   |   ✅    |   ⌛    |    ⌛    |
| [StaticEJBFieldShouldBeFinal](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#staticejbfieldshouldbefinal)                                 |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| [StringBufferInstantiationWithChar](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#stringbufferinstantiationwithchar)                     |  pmd-java  |  3.9   |   ✅    |   ⌛    |    ⌛    |
| [SuspiciousEqualsMethodName](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#suspiciousequalsmethodname)                                   |  pmd-java  |  2.0   |   ✅    |   ⌛    |    ⌛    |
| [SuspiciousHashcodeMethodName](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#suspicioushashcodemethodname)                               |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [SuspiciousOctalEscape](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#suspiciousoctalescape)                                             |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [TestClassWithoutTestCases](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#testclasswithouttestcases)                                     |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [UnconditionalIfStatement](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#unconditionalifstatement)                                       |  pmd-java  |  1.5   |   ✅    |   ⌛    |    ⌛    |
| [UnnecessaryBooleanAssertion](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#unnecessarybooleanassertion)                                 |  pmd-java  |  3.0   |   ✅    |   ⌛    |    ⌛    |
| [UnnecessaryCaseChange](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#unnecessarycasechange)                                             |  pmd-java  |  3.3   |   ✅    |   ⌛    |    ⌛    |
| [UnnecessaryConversionTemporary](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#unnecessaryconversiontemporary)                           |  pmd-java  |  0.1   |   ✅    |   ⌛    |    ⌛    |
| [UnusedNullCheckInEquals](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#unusednullcheckinequals)                                         |  pmd-java  |  3.5   |   ✅    |   ⌛    |    ⌛    |
| [UseCorrectExceptionLogging](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#usecorrectexceptionlogging)                                   |  pmd-java  |  3.2   |   ✅    |   ⌛    |    ⌛    |
| [UseEqualsToCompareStrings](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#useequalstocomparestrings)                                     |  pmd-java  |  4.1   |   ✅    |   ⌛    |    ⌛    |
| [UselessOperationOnImmutable](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#uselessoperationonimmutable)                                 |  pmd-java  |  3.5   |   ✅    |   ⌛    |    ⌛    |
| [UseLocaleWithCaseConversions](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#uselocalewithcaseconversions)                               |  pmd-java  |  2.0   |   ✅    |   ⌛    |    ⌛    |
| [UseProperClassLoader](https://pmd.github.io/latest/pmd_rules_java_errorprone.html#useproperclassloader)                                               |  pmd-java  |  3.7   |   ✅    |   ⌛    |    ⌛    |

### How to use?
#### Maven (pom.xml)
 ```xml
 ...
 <build>
   <plugins>
      ...
      <plugin>
         <groupId>org.apache.maven.plugins</groupId>
         <artifactId>maven-pmd-plugin</artifactId>
         <version>3.15.0</version>
         <executions>
            <execution>
               <phase>test</phase>
               <goals>
                  <goal>check</goal>
               </goals>
            </execution>
         </executions>
         <configuration>
            <printFailingErrors>true</printFailingErrors>
            <rulesets>
               ...
               <ruleset>io/github/dgroup/arch4u/pmd/arch4u-ruleset.xml</ruleset>
               ... 
            </rulesets>
            <excludeRoots>
               <excludeRoot>target/generated-sources/</excludeRoot>
            </excludeRoots>
         </configuration>
         <dependencies>
           <!-- Latest arch4u-rules -->
           <dependency>
             <groupId>io.github.dgroup</groupId>
             <artifactId>arch4u-pmd</artifactId>
             <version>${version}</version>
           </dependency>
         </dependencies>
      </plugin>
      ...
   </plugins>
 </build>
 ...
 ```
#### Gradle (build.gradle)
 ```groovy
 apply plugin: 'pmd'
 
 dependencies {
     ...
     pmd "io.github.dgroup:arch4u-pmd:${version}"    // use latest arch4u-pmd rules version
     pmd "commons-io:commons-io:2.11.0"              // required dependency by pmd engine
     ...
 }
 
 pmd {
     consoleOutput = true
     ruleSetFiles = files("io/github/dgroup/arch4u/pmd/arch4u-ruleset.xml")
     ruleSets = []                                   // Keep it as is, workaround for pmd
 }
 ```
#### Include arch4u-pmd rules into your existing custom ruleset
0. Don't forget to add rules to classpath in Maven/Gradle pmd plugin (see lines above) 
1. Let's assume that you already have pmd rules defined in `your-pmd-ruleset.xml`  
2. Add line `<rule ref="io/github/dgroup/arch4u/pmd/arch4u-ruleset.xml"/>` to `your-pmd-ruleset.xml`
   ```xml
   <?xml version="1.0"?>
   <ruleset name="pmd ruleset with your rules"
     xmlns="http://pmd.sourceforge.net/ruleset/2.0.0"
     xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
     xsi:schemaLocation="http://pmd.sourceforge.net/ruleset/2.0.0 https://pmd.sourceforge.io/ruleset_2_0_0.xsd">
    
     ...
     <rule ref="io/github/dgroup/arch4u/pmd/arch4u-ruleset.xml"/>
     ...

   </ruleset>
   ```
#### Exclude particular rule
```xml
<?xml version="1.0"?>
<ruleset name="pmd ruleset with your rules">
  ...
  <rule ref="io/github/dgroup/arch4u/pmd/arch4u-ruleset.xml">
     <exclude name="UseExistingMediaTypeConstant"/>
  </rule>
  ...
</ruleset>
```
#### Reconfigure a rule
```xml
<?xml version="1.0"?>
<ruleset name="pmd ruleset with your rules">
  ...
  <!-- 1. Exclude rule with default configuration  -->
  <rule ref="io/github/dgroup/arch4u/pmd/arch4u-ruleset.xml">
     <exclude name="UseExistingMediaTypeConstant"/>
  </rule>
  <!-- 2. Reconfigure rule with expected property -->
  <rule name="UseExistingMediaTypeConstant"
        language="java"
        externalInfoUrl="https://github.com/dgroup/arch4u-pmd/discussions/43"
        message="Use existing MediaType constant instead of string literal: https://github.com/dgroup/arch4u-pmd/discussions/43"
        class="io.github.dgroup.arch4u.pmd.UseExistingConstant">
    <priority>3</priority>
    <properties>
      <!-- 3. Set the 'regexPattern' considering your needs -->
      <property name="regexPattern" description="Regular expression of prohibited string"
                value="(^|\s)(application\/(json|xml|atom\+xml|x-www-form-urlencoded|octet-stream|svg\+xml|xhtml\+xml)|(multipart\/form-data)|(text\/(html|xml|plain)))(\s|$)"/>
    </properties>
   </rule> 
  ...
</ruleset>
```

### How to contribute?

[![EO badge](http://www.elegantobjects.org/badge.svg)](http://www.elegantobjects.org/#principles)

1. Pull requests are welcome! Don't forget to add your name to contribution section and run this,
   beforehand:
    ```bash
    mvn -Pqulice clean install
    ```
2. Everyone interacting in this project’s codebases, issue trackers, chat rooms is expected to
   follow the [code of conduct](.github/code_of_conduct.md).
3. Latest maven coordinates [here](https://github.com/dgroup/arch4u-pmd/releases):
    ```xml
    <dependency>
        <groupId>io.github.dgroup</groupId>
        <artifactId>arch4u-pmd</artifactId>
        <version>${version}</version>
    </dependency>
    ```
4. Download pmd rule designer - https://pmd.github.io/latest/pmd_userdocs_extending_designer_reference.html

### Contributors

*   [dgroup](https://github.com/dgroup) as Yurii Dubinka (<yurii.dubinka@gmail.com>)
*   [dykov](https://github.com/dykov) as Oleksii Dykov (<dykovoleksii@gmail.com>)
*   [smithros](https://github.com/smithros) as Rostyslav Koval (<kovalr2000@gmail.com>)
