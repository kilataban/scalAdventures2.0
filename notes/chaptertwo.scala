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


  MODULES, OBJECTS, AND NAMESPACES
  *Every value in Scala is essentially and object.
  * Each object may have zero or more members
  * A MODULE is an object whose primary job is to give it's members a namespace
  * A MEMBER can be defined using the 'def' keyword or with 'val' or 'object'
  * Members of objects are accessed using the dot notation
  * Access can be done using the objectName.member or in special cases reference using 'this'
  * Scala has no notion of operators
  * We can bring a member's scope by IMPORTING it which allows us to call it unqualified from then on.


  HIGHER-ORDER FUNCTIONS: PASSING FUNCTIONS TO FUNCTIONS
  *Functions are values therefore they can be assigned to variables, stored in Data Structures and passed as arguments to other functions
  * When writing purely functional programs HoF (Higher order Functions) - functions that accept other functions as arguments are used.
  * A recursive tail call essentially happens when the caller does nothing other than return the value of the recursive call.
  * While loops can be written in scala but are generally considered bad form through hindering good compositional style.
  * Variable naming conventions - using single letters such as f,g, or h for readability since all that matters is type.
  *

 */