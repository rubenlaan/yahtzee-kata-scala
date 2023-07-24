package nl.rubenlaan.scala.kata

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

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

    "return 9 given dices 3, 3, 3, 5, 6 and scoring it in threes" in {
      YahtzeeApp.score(Three, Three, Three, Five, Six, Threes) shouldBe 9
    }

    "return 12 given dices 4, 4, 4, 5, 6 and scoring it in fours" in {
      YahtzeeApp.score(Four, Four, Four, Five, Six, Fours) shouldBe 12
    }

    "return 10 given dices 5, 5, 3, 4, 6 and scoring it in fives" in {
      YahtzeeApp.score(Five, Five, Three, Four, Six, Fives) shouldBe 10
    }

    "return 18 given dices 6, 6, 6, 4, 5 and scoring it in sixes" in {
      YahtzeeApp.score(Six, Six, Six, Four, Five, Sixes) shouldBe 18
    }

    "return 40 given dices 1, 2, 3, 4, 5 and scoring it in large straight" in {
      YahtzeeApp.score(One, Two, Three, Four, Five, LargeStraight) shouldBe 40
    }

    "return 40 given dices 2, 3, 4, 5, 6 and scoring it in large straight" in {
      YahtzeeApp.score(Two, Three, Four, Five, Six, LargeStraight) shouldBe 40
    }

  }
}
