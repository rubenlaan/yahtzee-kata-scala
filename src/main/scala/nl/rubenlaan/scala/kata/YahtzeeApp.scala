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
      case Aces    => dices.filter(_ == One).map(_.value).sum
      case Twos    => dices.filter(_ == Two).map(_.value).sum
      case Threes  => dices.filter(_ == Three).map(_.value).sum
      case Fours   => dices.filter(_ == Four).map(_.value).sum
      case Fives   => dices.filter(_ == Five).map(_.value).sum
      case Sixes   => dices.filter(_ == Six).map(_.value).sum
      case Yahtzee => if (dices.distinct.length == 1) 50 else 0
    }
  }

}
