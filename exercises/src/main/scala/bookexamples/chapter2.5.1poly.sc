//This is a more generalized implementation that allows for any type A to be used
def findFirst[A](as: Array[A], p: A => Boolean): Int = {
  //instead of hardcoding String, take a type A as a parameter. And instead of hard coding an equality check for a given key, take a function with which to test each element of the array

  @annotation.tailrec
  def loop(n: Int): Int =
    if (n >= as.length) -1
    else if (p(as(n))) n
      //if the function p matches the current element, we've found a match and return its index to the array
    else loop(n + 1)

  loop(0)

}