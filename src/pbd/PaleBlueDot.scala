package pbd

import java.awt.Desktop
import java.net.URI
import scala.io.{BufferedSource, Source}

object PaleBlueDot {


  /**
   * Lecture Objective 1
   *
   * Converts degrees into radians
   *
   * @param degrees A value provided in degrees
   * @return The radian equivalent of the input value
   */
  def degreesToRadians(degrees: Double): Double = {
    0.0
  }


  /**
   * Lecture Objective 2
   *
   * Given a country name using and case (upper/lower), return the country code in all lowercase letters
   *
   * Ex. If "Heard Island and McDonald Islands#HM" is a line countriesFilename
   * and countryName is "hEaRd IsLaNd AnD mCdOnAlD iSlAnDs" the returned value is "hm"
   *
   * If countryName is not in the file, return the empty String: ""
   *
   * @param countriesFilename Name of the file containing country names and codes
   * @param countryName       The name of the country to lookup in the file with any mix of upper/lower-case
   * @return The two letter country code for countryName
   */
  def getCountryCode(countriesFilename: String, countryName: String): String = {
    val countriesFile: BufferedSource = Source.fromFile(countriesFilename)

    ""
  }


  /**
   * Lecture Objective 3
   *
   * Returns a Map[cityName -> population] for all cities in the given county and region. The name of each
   * city should match exactly how it appears in citiesFilename and the population is read from the file
   * and converted to an Int.
   *
   * Ex: PaleBlueDot.cityPopulations(citiesFilename, "ad", "04") returns Map("la massana" -> 7211) since
   * "la massana" is the only city in region "04" of Andorra (code "ad") and its population is 7211
   *
   * @param citiesFilename Name of the file containing city name, population, and location data
   * @param countryCode    A two character country code
   * @param region         A two character region code
   * @return A Map containing the name and population of every city matching both the countryCode and region
   */
  def cityPopulations(citiesFilename: String, countryCode: String, region: String): Map[String, Int] = {
    Map()
  }


  /**
   * Lecture Objective 4
   *
   * Returns a List of city names in the given county and region with a population at least minPopulation.
   *
   * @param citiesFilename Name of the file containing city name, population, and location data
   * @param countryCode    A two character country code
   * @param region         A two character region code
   * @param minPopulation  the minimum population that could be returned
   * @return All city names in countryCode/region with a population >= minPopulation
   */
  def bigCities(citiesFilename: String, countryCode: String, region: String, minPopulation: Int): List[String] = {
    List()
  }


  /**
   * Lecture Objective 5
   *
   * Computes the grater circle distance ("As the crow flies") between two locations on Earth in kilometers.
   * The input locations are given as Lists of Double containing the latitude and longitude coordinates of that
   * location. For example, if the location is latitude: 35.685 and longitude: 139.751389 the input would be
   * List(35.685, 139.751389).
   *
   * @param location1 A location on Earth given as a List containing latitude and longitude coordinates
   * @param location2 A location on Earth given as a List containing latitude and longitude coordinates
   * @return The greater circle distance between the two input locations
   */
  def greaterCircleDistance(location1: List[Double], location2: List[Double]): Double = {
    val earthRadius: Double = 6371.0 // km

    val lat1: Double = degreesToRadians(location1.head)
    val lon1: Double = degreesToRadians(location1(1))

    0.0
  }


  /**
   * Programming Objective 1
   *
   * You find yourself stranded in an unfamiliar place with no signs of civilization. You don't have much with you,
   * but you do have a locator that gives your current latitude/longitude, a csv file of cities, and your final
   * submission to the PaleBlueDot assignment from CSE116 (What luck!). You decide that finding and walking
   * directly to the closest city will give you the best chance to survive.
   *
   * @param citiesFilename Name of the file containing city name, population, and location data
   * @param location       A location on Earth given as a List containing latitude and longitude coordinates
   * @return The city closest to the given location as a List containing country code, city name, and region
   *         exactly as they appear in the cities file
   */
  def closestCity(citiesFilename: String, location: List[Double]): List[String] = {
    List("Country Code", "City Name", "Region")
  }


  /**
   * Programming Objective 2
   *
   * Find the population of a country by name. Not quite a life or death situation, but interesting information
   * regardless.
   *
   * @param countriesFilename Name of the file containing country names and codes
   * @param citiesFilename    Name of the file containing city name, population, and location data
   * @param countryName       The name of the country with any mix of upper/lower-case
   * @return The total population of the given country
   */
  def countryPopulation(countriesFilename: String, citiesFilename: String, countryName: String): Int = {
    0
  }


  /**
   * Application Objective
   *
   * You're in a city. I'm in a city. We want to meet in a city with a fair split of travel distance for each of us.
   * We happen to both own helicopters so we'll travel "as the crow flies" and we're not concerned about roads or
   * oceans. We just need to find the city closest to the midpoint between our two cities and we'll meet there.
   *
   * Each city is provided to this method as a List containing the country code, name, and region exactly as they
   * appear in the cities file (ie. Don't do anything with upper/lower-case in this method.) The returned city should
   * follow the same formatting (Don't modify the upper/lower-case of any Strings).
   *
   * @param citiesFilename Name of the file containing city name, population, and location data
   * @param city1          A city as a List containing country code, name, and region exactly as they appear in the
   *                       cities file
   * @param city2          A city as a List containing country code, name, and region exactly as they appear in the
   *                       cities file
   * @return The city closest to the midpoint of the two input cities as a List containing country code, city name,
   *         and region exactly as they appear in the cities file
   */
  def whereToMeet(citiesFilename: String, city1: List[String], city2: List[String]): List[String] = {
    List("Country Code", "City Name", "Region")
  }


  /**
   * Helper Method
   *
   * Opens Google Maps at a specific location. The location is a List containing the latitude then longitude as Doubles
   *
   * @param location The location to open in the format List(Latitude, Longitude)
   */
  def openMap(location: List[Double]): Unit = {
    if (Desktop.isDesktopSupported && Desktop.getDesktop.isSupported(Desktop.Action.BROWSE)) {
      val url: String = "http://maps.google.com/maps?t=m&q=loc:" + location.head.toString + "+" + location(1).toString
      Desktop.getDesktop.browse(new URI(url))
    } else {
      println("Opening the browser not supported")
    }
  }


  def main(args: Array[String]): Unit = {
    openMap(List(43.002743, -78.7874136))
  }

}
