# Scala Kata Base

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
