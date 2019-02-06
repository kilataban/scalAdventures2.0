//This chapter entails more aspects of the Scala Language
/**This includes but isn't limited to HoF (Higher Order Functions),
Tail Recursive functions and Polymorphic HoFs that use types as a guide toward implementation

  *Scala code must be in an Object or Class with curly braces
  * The object keyword creates a named class with a single instance, also known as a singleton type
  * Return types of functions are inferred in Scala however it is always good form to declare them
  * A pair of braces containing statements is referred to as a block
  * A val is an immutable value
  * main is a special function because when a program is run, Scala will look for a method named main
  * main has to take an array of strings as an argument and return a String
  * A return type of Unit is often an indication of side effects


   RUNNING OUR PROGRAM
  *The simplest way to run Scala code is through the console (REPL)
  *First it is placed in a scala file for compilation using the scalac compiler

  *The syntax is scalac filename.scala
  * This will return some files after compile time, the one with a class suffix should be run using the following syntax
  * scala className

  *Another method could be using the Scala Interpreter by passing the file to Scala commandline tool directly
  * the syntax is scala filename.scala

  *The final method is loading the source file onto the REPL using the syntax prompts as such
  > scala

  > :load MyModule.scala

  > MyModule.abs(-42)

  *The paste command also allows for the pasting of multiple lines of code

 */