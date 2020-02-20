# K4F

K4F (Kotlin for Firebase) is a project template that provides the ability to create Firebase functions in Kotlin and
then compile them into javascript.

## Developing
Code can be put into the `src/main/kotlin` directory, the `Index.kt` file is a bare minimum example that
compiles the same code of the [get started][1] section of the official firebase documentation.

Any additional JS dependency that might be needed can be put into the `package.json` file under `src/main/resources`

## Firebase autosuggestions
To use the IDE's autosuggestions, keep the [firebase-autosuggest][2] library updated in your `gradle.properties` file

## Compiling and deploying
In order to compile, you need to have npm and firebase cli installed on your system. To install firebase cli, follow the
[official firebase documentation][1] 
To compile kotlin into javascript and create the bundle, use `./gradlew build`. The compiled output will be found under
`build/firebase` with the correct firebase directory structure.

You can also use `./gradlew bundle` to build and install node dependencies under the build directory.

In order to deploy the functions, you must use the firebase cli.

[1]: https://firebase.google.com/docs/functions/get-started
[2]: https://github.com/LukeDS-it/firebase-autosuggest
