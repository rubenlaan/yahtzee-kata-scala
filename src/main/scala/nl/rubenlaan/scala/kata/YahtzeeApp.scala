package nl.rubenlaan.scala.kata

sealed trait Category
case object Chance extends Category
case object Aces extends Category
case object Twos extends Category
case object Threes extends Category
case object Fours extends Category
case object Fives extends Category
case object Sixes extends Category
case object Yahtzee extends Category

sealed trait Dice {
  val value: Int
}

case object One extends Dice {
  override val value: Int = 1
}
case object Two extends Dice {
  override val value: Int = 2
}
case object Three extends Dice {
  override val value: Int = 3
}
case object Four extends Dice {
  override val value: Int = 4
}
case object Five extends Dice {
  override val value: Int = 5
}
case object Six extends Dice {
  override val value: Int = 6
}

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

    category match {
      case Chance  => dices.map(_.value).sum
      case Aces    => sumDicesBy(One)(dices)
      case Twos    => sumDicesBy(Two)(dices)
      case Threes  => sumDicesBy(Three)(dices)
      case Fours   => sumDicesBy(Four)(dices)
      case Fives   => sumDicesBy(Five)(dices)
      case Sixes   => sumDicesBy(Six)(dices)
      case Yahtzee => if (dices.distinct.length == 1) 50 else 0
    }
  }

  private def sumDicesBy(dice: Dice)(dices: Seq[Dice]) =
    dices.filter(_ == dice).map(_.value).sum
}
