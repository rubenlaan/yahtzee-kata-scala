package nl.rubenlaan.scala.kata

object YahtzeeApp {
  def score(
      dice1: Dice,
      dice2: Dice,
      dice3: Dice,
      dice4: Dice,
      dice5: Dice,
      category: Category
  ): Int = {
    val dices = Seq(dice1, dice2, dice3, dice4, dice5)

    category score dices
  }
}
