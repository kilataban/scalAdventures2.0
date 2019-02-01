//The functional solution is obviously the removal of side effects

class Cafe{
  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    //two explicit return types determined above as the Coffee and Charge
    val cup = new Coffee ()
    (cup, Charge(cc, cup.price))
    //to create a pair, we put the cup and charge in parentheses seperated by a comma

    /*Charge is a new data type we've made for the representation of payments using CreditCard and an amount equipped
    with combine which is a handy function for combining charges on the same CreditCard
     */

  }

  /*A case class has one primary constructor whose argumwent list comes after the class name (here, Charge) the parameters
  in the list become immutable fields of the class and are accessed using the dot notation as other.cc
   */
  case class Charge(cc: CreditCard, amount: Double){

    def combine(other: Charge): Charge =

      if (cc == other.cc)

        Charge(cc, amount + other.amount)
        /*the case class is created above without the keyword new, just us the class name followed by the list of arguments for
        the primary constructor*/

    else

        throw new Exception ("Can't combine charges to different cards")
  }

  //The next code instance is an implementation of buyCoffee as a function
  def buyCoffee(cc: CreditCard): (Coffee, Charge) =

  def buyCoffees(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
      //this is an immutable singly linkedlist of Coffee values (MORE IN CHAPTER 3)

    val purchases: List[(Coffee, Charge)] = List.fill(n) (buyCoffee(cc))
      //List.fill(n)(x) creates a List with n copies of x.

    val (coffees, charges) = purchases.unzip
      //unzip splits a list of pairs into a pair of lists, in this instance that is coffee and charges

    (coffees, charges.reduce(c1, c2) => c1.combine(c2))
      //charges.reduce reduces the entire list of charges to a single charge using combine to combine 2 charges at a time
      //Reduce is a Higher order Function (MORE IN CHAPTER 2)
    }
}