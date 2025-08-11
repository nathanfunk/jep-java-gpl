Jep Java GPL
============
[![Maven Central](https://img.shields.io/maven-central/v/io.github.nathanfunk/jep.svg)](https://central.sonatype.com/artifact/io.github.nathanfunk/jep)
The offical Jep - Java Expression Parser GPL release

View the documentation - http://htmlpreview.github.io/?https://github.com/nathanfunk/jep-java-gpl/blob/master/doc/html/index.html

Jep Java parses and evaluates mathematical expressions with only a few lines of code. This package allows your users to enter a formula as a string, and instantly evaluate it. Jep supports user defined variables, constants, and functions. A number of common mathematical functions and constants are included.

Maven Central
-------------
Coordinates:

- groupId: io.github.nathanfunk
- artifactId: jep
- version: 2.4.5

Maven (pom.xml):

```xml
<dependency>
	<groupId>io.github.nathanfunk</groupId>
	<artifactId>jep</artifactId>
	<version>2.4.5</version>
</dependency>
```

Gradle (Groovy DSL):

```groovy
dependencies {
	implementation 'io.github.nathanfunk:jep:2.4.5'
}
```

Gradle (Kotlin DSL):

```kotlin
dependencies {
	implementation("io.github.nathanfunk:jep:2.4.5")
}
```

Features
--------
- Small size
- Fast evaluation
- Includes common math functions and operators
- Supports Boolean expressions
- Extendable and configurable architecture
- Support for strings, vectors and complex numbers
- Support for implicit multiplication
- Allows declared or undeclared variables
- Extensive documentation
- Includes JavaCC grammar from which the main classes are generated

The commercialversion of Jep (http://singularsys.com/jep) includes additional features:
- Improved evaluation speed
- High precision using BigDecimals
- Substantially increased customizability

