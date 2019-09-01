# Kotlin Script Example
Learning how to create a simple (native) executable script using Kotlin

## Prequisites
* Please install a standalone Kotlin compiler. If you are using `*Nix`, you can use `brew` with the following command in your console;
  ```ruby
  brew install kotlin
  ```

* Check if Kotlin compiler already installed with typing `kotlinc` in your console

## How to test a Script ?

* Kotlin script has two different executables, you can use Kotlin compiler or Native compiler based on your needs :smile:

* If you are using Kotlin compiler, please create a Kotlin file with extension `.kts` and compile it in your console using the following command;
  ```kotlin;
  kotlinc -script your_file.kts
  ```

* If you are using Native compiler, please build the project using `gradle` wrapper command like this;
  ```groovy;
  ./gradlew clean build
  ```

* Then run the `.kexe` extension from your console using the following command;

    ##### Debug
  ```kotlin;
  ./gradlew runDebugExecutableMacos
  ```
  ##### Release
    ```kotlin;
    ./gradlew runReleaseExecutableMacos
    ```

* For other operating system, please change the `suffix` instead :smile:
