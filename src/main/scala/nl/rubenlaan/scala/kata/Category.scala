package nl.rubenlaan.scala.kata

import nl.rubenlaan.scala.kata.Category.sumDices

sealed trait Category {
  def score(dices: Seq[Dice]): Int
}

case object Chance extends Category {
  override def score(dices: Seq[Dice]): Int = sumDices()(dices)
}
case object Aces extends Category {
  override def score(dices: Seq[Dice]): Int = sumDices(_ == One)(dices)
}
case object Twos extends Category {
  override def score(dices: Seq[Dice]): Int = sumDices(_ == Two)(dices)
}
case object Threes extends Category {
  override def score(dices: Seq[Dice]): Int = sumDices(_ == Three)(dices)
}
case object Fours extends Category {
  override def score(dices: Seq[Dice]): Int = sumDices(_ == Four)(dices)
}
case object Fives extends Category {
  override def score(dices: Seq[Dice]): Int = sumDices(_ == Five)(dices)
}
case object Sixes extends Category {
  override def score(dices: Seq[Dice]): Int = sumDices(_ == Six)(dices)
}
case object Yahtzee extends Category {
  override def score(dices: Seq[Dice]): Int = if (isYahtzee(dices)) 50 else 0

  private def isYahtzee(dices: Seq[Dice]) = {
    dices.distinct.length == 1
  }
}
case object LargeStraight extends Category {
  override def score(dices: Seq[Dice]): Int =
    if (isLargeStraight(dices)) 40 else 0

  private def isLargeStraight(dices: Seq[Dice]): Boolean =
    dices == Seq(One, Two, Three, Four, Five) ||
      dices == Seq(Two, Three, Four, Five, Six)
}

case object SmallStraight extends Category {
  override def score(dices: Seq[Dice]): Int = if (
    dices.containsSlice(Seq(One, Two, Three, Four)) ||
    dices.containsSlice(Seq(Two, Three, Four, Five)) ||
    dices.containsSlice(Seq(Three, Four, Five, Six))
  ) 30
  else 0

}

case object ThreeOfAKind extends Category {
  override def score(dices: Seq[Dice]): Int = if (
    dices.containsSlice(Seq.fill(3)(One)) ||
    dices.containsSlice(Seq.fill(3)(Two)) ||
    dices.containsSlice(Seq.fill(3)(Three)) ||
    dices.containsSlice(Seq.fill(3)(Four)) ||
    dices.containsSlice(Seq.fill(3)(Five))
  ) sumDices()(dices)
  else 0
}

case object FourOfAKind extends Category {
  override def score(dices: Seq[Dice]): Int = if (
    dices.containsSlice(Seq.fill(4)(One)) ||
    dices.containsSlice(Seq.fill(4)(Two)) ||
    dices.containsSlice(Seq.fill(4)(Three)) ||
    dices.containsSlice(Seq.fill(4)(Four)) ||
    dices.containsSlice(Seq.fill(4)(Five))
  ) sumDices()(dices)
  else 0
}

object Category {
  def sumDices(predicate: Dice => Boolean = _ => true): Seq[Dice] => Int =
    (dices: Seq[Dice]) => dices.filter(predicate).map(_.value).sum
}
