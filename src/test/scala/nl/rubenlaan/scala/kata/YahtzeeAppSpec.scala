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

    "return 30 given dices 2, 3, 4, 5, 2 and scoring it in small straight" in {
      YahtzeeApp.score(Two, Three, Four, Five, Two, SmallStraight) shouldBe 30
    }

    "return 30 given dices 5, 1, 2, 3, 4 and scoring it in small straight" in {
      YahtzeeApp.score(Five, One, Two, Three, Four, SmallStraight) shouldBe 30
    }

    "return 0 given dices 3, 4, 3, 4, 5 and scoring it in small straight" in {
      YahtzeeApp.score(Three, Four, Three, Four, Five, SmallStraight) shouldBe 0
    }

    "return 24 given dices 4, 5, 5, 5, 5 and scoring it in four of a kind" in {
      YahtzeeApp.score(Four, Five, Five, Five, Five, FourOfAKind) shouldBe 24
    }

    "return 28 given dices 4, 6, 6, 6, 6 and scoring it in four of a kind" in {
      YahtzeeApp.score(Four, Six, Six, Six, Six, FourOfAKind) shouldBe 28
    }

    "return 0 given dices 4, 4, 5, 5, 5 and scoring it in four of a kind" in {
      YahtzeeApp.score(Four, Four, Five, Five, Five, FourOfAKind) shouldBe 0
    }

    "return 17 given dices 2, 3, 4, 4, 4 and scoring it in three of a kind" in {
      YahtzeeApp.score(Two, Three, Four, Four, Four, ThreeOfAKind) shouldBe 17
    }

    "return 0 given dices 4, 4, 2, 5, 5 and scoring it in three of a kind" in {
      YahtzeeApp.score(Four, Four, Two, Five, Five, ThreeOfAKind) shouldBe 0
    }

    "return 20 given dices 1, 1, 6, 6, 6 and scoring it in three of a kind" in {
      YahtzeeApp.score(One, One, Six, Six, Six, ThreeOfAKind) shouldBe 20
    }

    "return 25 given dices 2, 2, 5, 5, 5 and scoring it in full house" in {
      YahtzeeApp.score(Two, Two, Five, Five, Five, FullHouse) shouldBe 25
    }

    "return 25 given dices 5, 5, 5, 1, 1 and scoring it in full house" in {
      YahtzeeApp.score(Five, Five, Five, One, One, FullHouse) shouldBe 25
    }

    "return 0 given dices 2, 5, 5, 5, 5 and scoring it in full house" in {
      YahtzeeApp.score(Two, Five, Five, Five, Five, FullHouse) shouldBe 0
    }

  }
}
