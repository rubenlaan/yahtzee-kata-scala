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
case object LargeStraight extends Category

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
      case Chance        => sumDices()(dices)
      case Aces          => sumDices(_ == One)(dices)
      case Twos          => sumDices(_ == Two)(dices)
      case Threes        => sumDices(_ == Three)(dices)
      case Fours         => sumDices(_ == Four)(dices)
      case Fives         => sumDices(_ == Five)(dices)
      case Sixes         => sumDices(_ == Six)(dices)
      case Yahtzee       => if (dices.distinct.length == 1) 50 else 0
      case LargeStraight => if (isLargeStraight(dices)) 40 else 0
    }
  }

  private def sumDices(predicate: Dice => Boolean = _ => true) =
    (dices: Seq[Dice]) => dices.filter(predicate).map(_.value).sum

  private def isLargeStraight(dices: Seq[Dice]): Boolean =
    dices == Seq(One, Two, Three, Four, Five) ||
    dices == Seq(Two, Three, Four, Five, Six)
}
