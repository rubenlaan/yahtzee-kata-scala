package nl.rubenlaan.scala.kata

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
