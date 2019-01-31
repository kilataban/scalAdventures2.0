//The functional solution is obviously the removal of side effects

class Cafe{
  def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
    //two explicit return types determined above as the Coffee and Charge
    val cup = new Coffee ()
    (cup, Charge(cc, cup.price))
    //to create a pair, we put the cup and charge in parentheses seperated by a comma 

  }
}