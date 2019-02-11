//Implement isSorted which checks whether an Array[A] is sorted according to a given comparison function
object testModule {
  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {

    def loop(n: Array[A]): Boolean =
    //testing if element is within ordering range of Array

      if (n.length >= as.length) true
      else if (ordered(n[A], n[A])) false
      else false


  }
}