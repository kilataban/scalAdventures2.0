//Referential transparency(RT), purity, and the substitution model

//RT Application to the original buyCoffee Method

def buyCoffee(cc: CreditCard): Coffee = {
  val cup = new Coffee()
  cc.charge(cup.price)
  cup
}

//RT isn't applicable here on the mere premise that it doesn't fulfill the purpose set by the substitution model
