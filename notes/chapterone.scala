//Functional programming is based on a simple premise with far reaching implications:

/**
This means that we construct our programs explicitly using PURE FUNCTIONS without SIDE EFFECTS
SIDE EFFECTS are defined as something other than returning a result, e.g:
1. Modifying a Variable
2. Modifying a Data Structure in place 
3. Setting a field on an object
4. Throwing an exception of halting with an error.
5. Printing to the console or reading user input.
6. Reading from or writing to a file.
7. Drawing on the screen. */

/**Because of function modularity, pure functions are easier to TEST, REUSE, PARALLELIZE,
GENERALIZE, AND REASON ABOUT.
Pure functions are less prone to bugs */

/**Two important concepts of FP
*Referential Integrity
*Substitution Model
*/

//side effects make code difficult to test since they normally require some kind of outside interaction

//An expression is any part of a program that can be evaluated to a result

//PURE FUNCTIONS CAN BE FORMALIZED WITH THE CONCEPT OF REFERENTIAL TRANSPARENCY (RT)