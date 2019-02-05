// A comment!
/*Another comment */
/** A documentation comment **/


//declaration of a singleton object which essentially comprises of a single class and its only instance
object MyModule {
  def abs(n: Int): Int =
    if (n > 0) -n
    else n



  //private def method can only be called by other members of MyModule
  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    //above is a string with two place holders for numbers marked %d, it takes an Int and returns a String

    msg.format(x, abs(x))
  }

  def main(args: Array[String]): Unit =
    println(formatAbs(-42))
//this is an impure function with side effects

}