# Scala Kata Base

[![Scala CI](https://github.com/rstraub/scala-kata-base/actions/workflows/scala.yml/badge.svg)](https://github.com/rstraub/scala-kata-base/actions/workflows/scala.yml)
[![Scala Steward badge](https://img.shields.io/badge/Scala_Steward-helping-blue.svg?style=flat&logo=data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAA4AAAAQCAMAAAARSr4IAAAAVFBMVEUAAACHjojlOy5NWlrKzcYRKjGFjIbp293YycuLa3pYY2LSqql4f3pCUFTgSjNodYRmcXUsPD/NTTbjRS+2jomhgnzNc223cGvZS0HaSD0XLjbaSjElhIr+AAAAAXRSTlMAQObYZgAAAHlJREFUCNdNyosOwyAIhWHAQS1Vt7a77/3fcxxdmv0xwmckutAR1nkm4ggbyEcg/wWmlGLDAA3oL50xi6fk5ffZ3E2E3QfZDCcCN2YtbEWZt+Drc6u6rlqv7Uk0LdKqqr5rk2UCRXOk0vmQKGfc94nOJyQjouF9H/wCc9gECEYfONoAAAAASUVORK5CYII=)](https://scala-steward.org)

Starter project for Code Katas in Scala. Batteries included.

Included:

* Sbt setup (build tool)
* Scalatest (testing library)
* Mockito (mocking library)
* Scalafmt (code formatting)

## Installation

This project requires some tooling on your machine, as described in the `.sdkmanrc`. If you use sdkman `cd` into the
root of this project and run:

```shell
sdk env install
```

to install the required sdks. You can also install them yourself.

## Compile

```shell
sbt compile
```

## Tests

Run tests once:

```shell
sbt test
```

Or in watch mode:

```shell
sbt ~test
```

## Format

```shell
sbt scalafmtAll
```

## IDE

If you're using Intellij, make sure you have the [Scala plugin](https://plugins.jetbrains.com/plugin/1347-scala)
installed.
