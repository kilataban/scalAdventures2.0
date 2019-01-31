//This is an illustration of programs with side effects
//This program is supposed to illustrate handling of purchases at a coffee shop

class Cafe {

  def buyCoffee(cc: CreditCard, p: Payments): Coffee = {

    val cup = new Coffee()
    //no semicolons are necessary because newlines delimit statements in blocks

    p.charge(cc, cup.price)
    //this is the side effect where the credit card is charged

    cup
    //return not needed because this is the final statement in the block and is automatically returned
  }
}

//A problem with the current implementation with bundled objects is reusability
//A PAYMENTS OBJECT SHOULD BE ADDED IN ORDER TO ENSURE ABSTRACTION WHEN PASSED INTO buyCoffee
