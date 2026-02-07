Jep Java GPL
============
[![Maven Central](https://img.shields.io/maven-central/v/io.github.nathanfunk/jep.svg)](https://central.sonatype.com/artifact/io.github.nathanfunk/jep) [![javadoc](https://javadoc.io/badge2/io.github.nathanfunk/jep/javadoc.svg)](https://javadoc.io/doc/io.github.nathanfunk/jep)

The official Jep - Java Expression Parser GPL release

> **Looking for the latest features?** Check out the [**commercial version (Jep 4.x)**](https://www.singularsys.com/jep) with active development, advanced features, and enterprise support. Latest release: **February 2026**

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

## GPL vs Commercial Versions

This repository contains the **open source GPL version** of Jep, suitable for projects compatible with GPL licensing.

For production applications and advanced features, the **commercial version** offers:

| Feature | GPL (2.x) | Commercial (4.x) |
|---------|-----------|------------------|
| **Active Development** | Stable/Mature | ✅ Latest: Feb 2026 |
| **Basic Evaluation** | ✅ | ✅ |
| **Performance** | Good | ⚡ Significantly Faster |
| **Precision** | Standard | ✅ BigDecimal Support |
| **Java Compatibility** | Java 1.5+ | ✅ Java 8 - 17+ |
| **Extensions** | Basic | ✅ Symbolic ops, matrices, more |
| **Enterprise Support** | Community | ✅ Available |
| **License** | GPL | Commercial |

**Commercial Version:** http://www.singularsys.com/jep  
**Try it:** [Download Trial](https://www.singularsys.com/jep/download-trial.php) | [Features](https://www.singularsys.com/jep/) | [Purchase](https://www.singularsys.com/order/)

---

**License:** GNU General Public License (GPL)
