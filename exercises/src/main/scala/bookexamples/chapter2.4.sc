//HIGHER-ORDER FUNCTIONS: PASSING FUNCTIONS TO FUNCTIONS

//A Short Detour: writing loops functionally

def factorial(n: Int): Int = {
  def go(n: Int, acc: Int): Int =
    if (n <= 0) n
    else go(n -1, n * acc)


  go(n, 1)
}
//in the case of reference to the functions above, tail call recursion takes place since we are essentially returning a value

//If we would to make tail call elimination evident to the Scala compiler, we use the tailrec annotation
def factorialEl(n: Int): Int = {
  @annotation.tailrec
  def go(n: Int, acc: Int): Int =
    if(n <= 0) n
    else go(n - 1, n * acc)

  go(n, 1)
}