package nl.rubenlaan.scala.kata

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DiceSpec extends AnyFlatSpec with Matchers {
 "create" should "be a number from one to six" in {
     One.value shouldBe 1
     Two.value shouldBe 2
     Three.value shouldBe 3
     Four.value shouldBe 4
     Five.value shouldBe 5
     Six.value shouldBe 6
 }
}
