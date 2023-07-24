package nl.rubenlaan.scala.kata

import org.scalatest.BeforeAndAfter
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import org.scalatestplus.mockito.MockitoSugar

class YahtzeeAppSpec extends AnyWordSpec with Matchers {
  "score" should {
    "sum all dices given dices scored on chance" in {
      YahtzeeApp.score(One, Two, Three, Four, Five, Chance) shouldBe 15
    }

    "return 50 given all dices are equal and scoring it on yahtzee" in {
      YahtzeeApp.score(One, One, One, One, One, Yahtzee) shouldBe 50
    }

    "return 0 given dices are unequal and scoring it on yahtzee" in {
      YahtzeeApp.score(One, One, One, One, Two, Yahtzee) shouldBe 0
    }

    "return 3 given dices 1, 1, 1, 3, 4 and scoring it in aces" in {
      YahtzeeApp.score(One, One, One, Three, Four, Aces) shouldBe 3
    }

    "return 6 given dices 2, 2, 2, 5, 6 and scoring it in twos" in {
      YahtzeeApp.score(Two, Two, Two, Five, Six, Twos) shouldBe 6
    }

  }
}
