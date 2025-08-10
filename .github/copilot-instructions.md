# JEP - Java Expression Parser

JEP is a Java library for parsing and evaluating mathematical expressions with minimal code. The library supports user-defined variables, constants, functions, and includes common mathematical functions and operators. This is the GPL version (2.4.3) of the library.

Always reference these instructions first and fallback to search or bash commands only when you encounter unexpected information that does not match the info here.

## Working Effectively

**NEVER CANCEL builds or tests** - all operations complete within reasonable timeframes.

### Bootstrap and Build Steps
- Ensure Java 17+ is installed: `java -version`
- Ensure Maven 3.6+ is available: `mvn --version`
- Clean build: `mvn clean compile` -- takes 5 seconds. NEVER CANCEL. Set timeout to 60+ seconds.
- Full build and test: `mvn clean install -Dmaven.javadoc.skip=true -Dgpg.skip=true` -- takes 8 seconds. NEVER CANCEL. Set timeout to 60+ seconds.

### Build Issues and Workarounds
- **GPG signing FAILS** without proper GPG keys configured. Always use `-Dgpg.skip=true` for local development.
- Use working build command: `mvn clean install -Dmaven.javadoc.skip=true -Dgpg.skip=true`

### Testing
- Run tests only: `mvn test -Dgpg.skip=true` -- takes 3 seconds. NEVER CANCEL. Set timeout to 30+ seconds.
- **202 test cases** run successfully with comprehensive coverage
- Tests include expression parsing, mathematical operations, matrix operations, vector operations, and symbolic differentiation

### Example Applications
Run examples after building:
- Basic expression evaluation: `java -cp target/jep-2.4.3.jar org.nfunk.jepexamples.SimpleTest`
- Advanced expressions: `java -cp target/jep-2.4.3.jar org.lsmp.djepExamples.XJepExample` 
- **GUI examples will FAIL in headless environments** (Console, Evaluator, Fractal, FunctionPlotter applets)

## Validation

- **ALWAYS run the full build and test suite** before and after making changes.
- **ALWAYS test basic functionality** by running: `java -cp target/jep-2.4.3.jar org.nfunk.jepexamples.SimpleTest`
- **ALWAYS verify advanced functionality** by running: `java -cp target/jep-2.4.3.jar org.lsmp.djepExamples.XJepExample`
- The build creates `target/jep-2.4.3.jar` and `target/jep-2.4.3-sources.jar` artifacts
- **No linting or formatting tools** are configured in the project

## Codebase Structure

### Key Directories and Files
```
/home/runner/work/jep-java-gpl/jep-java-gpl/
├── pom.xml                    # Maven build configuration (Java 17, JUnit 4)
├── README.md                  # Project overview and features
├── src/main/java/
│   ├── org/nfunk/jep/         # Core JEP library (Parser, JEP, functions, operators)
│   ├── org/nfunk/jepexamples/ # Basic examples (SimpleTest, Console, Evaluator)
│   └── org/lsmp/              # Extended DJEP functionality
│       ├── djep/              # Advanced parsing and symbolic math
│       └── djepExamples/      # Advanced examples and console applications
├── src/test/java/             # JUnit test suite (202 tests)
├── bin/                       # Legacy shell scripts for examples
├── doc/                       # Documentation and JavaDoc
└── .github/workflows/         # CI/CD configuration
```

### Core Components
- **Parser.jjt**: JavaCC grammar file defining the expression parsing language
- **JEP.java**: Main entry point for basic expression parsing
- **org.lsmp.djep**: Extended functionality including symbolic differentiation, matrices, vectors
- **Examples**: 30+ example classes demonstrating various features

### Frequently Used Classes
- `org.nfunk.jep.JEP`: Basic expression parser
- `org.lsmp.djep.djep.DJep`: Extended parser with symbolic differentiation
- `org.lsmp.djep.xjep.XJep`: Parser with assignment operations
- `org.lsmp.djep.matrixJep.MatrixJep`: Matrix operation parser
- `org.lsmp.djep.vectorJep.VectorJep`: Vector operation parser

## CI/CD Pipeline

### GitHub Actions Workflows
- **maven.yml**: Runs on push/PR to master, builds with Java 17, runs `mvn clean install`
- **maven-release.yml**: Publishes to Maven Central on version tags (requires GPG secrets)

### Dependencies
- **JUnit 4.13.2**: Legacy test framework
- **JUnit Vintage Engine 5.11.1**: Runs JUnit 4 tests under modern Surefire
- **JAMA 1.0.3**: Java Matrix Package for linear algebra operations

## Common Commands Reference

### Repository root contents
```
.devcontainer/     .git/              .github/           .gitignore         
CHANGES.txt        COPYRIGHT.txt      DjepTODO.txt       LICENSE-gpl.txt    
README.html        README.md          ToDo.txt           bin/               
build.xml.old      doc/               lib/               pom.xml            
src/               target/ (after build)
```

### Maven build artifacts (after successful build)
```
target/
├── jep-2.4.3.jar              # Main library JAR
├── jep-2.4.3-sources.jar      # Source code JAR  
├── classes/                   # Compiled class files
├── test-classes/              # Compiled test classes
└── surefire-reports/          # Test execution reports
```

### Working build commands summary
```bash
# Basic compilation (5 seconds)
mvn clean compile

# Full build with tests (8 seconds, recommended)
mvn clean install -Dmaven.javadoc.skip=true -Dgpg.skip=true

# Test only (3 seconds)
mvn test -Dgpg.skip=true

# Validate functionality after build
java -cp target/jep-2.4.3.jar org.nfunk.jepexamples.SimpleTest
java -cp target/jep-2.4.3.jar org.lsmp.djepExamples.XJepExample
```