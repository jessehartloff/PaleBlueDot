package tests

import org.scalatest._
import pbd.PaleBlueDot

class Task1 extends FunSuite {

  val countriesFile: String = "data/countries.txt"

  test("1 - Country names that have proper capitalization") {

    val testCases: Map[String, String] = Map(
      "Uganda" -> "ug",
      "Japan" -> "jp",
      "South Africa" -> "za",
      "Peru" -> "pe",
      "Belgium" -> "be",
      "Albania" -> "al"
    )

    for ((input, expectedOutput) <- testCases) {
      val computedOutput: String = PaleBlueDot.getCountryCode(countriesFile, input)
      assert(computedOutput == expectedOutput, input + " -> " + computedOutput)
    }

  }

  test("2 - Country names with random upper/lower-case") {
    val testCases: Map[String, String] = Map(
      "hEaRd IsLaNd AnD mCdOnAlD iSlAnDs" -> "hm",
      "UGANDA" -> "ug",
      "south africa" -> "za",
      "jAPAn" -> "jp",
      "PEru" -> "pe",
      "chilE" -> "cl"
    )

    for ((input, expectedOutput) <- testCases) {
      val computedOutput: String = PaleBlueDot.getCountryCode(countriesFile, input)
      assert(computedOutput == expectedOutput, input + " -> " + computedOutput)
    }

  }

  test("3 - Test cases that are not countries in the data file") {
    val testCases: Map[String, String] = Map(
      "" -> "",
      "Not a real country" -> "",
      "j a p a n" -> ""
    )

    for ((input, expectedOutput) <- testCases) {
      val computedOutput: String = PaleBlueDot.getCountryCode(countriesFile, input)
      assert(computedOutput == expectedOutput, input + " -> " + computedOutput)
    }

  }

}
