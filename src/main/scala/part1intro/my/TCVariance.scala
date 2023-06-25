package part1intro.my

object TCVariance {

  class Animal
  class Dog extends Animal

  class Zoo[+T]

  val zoo: Zoo[Animal] = new Zoo[Dog]


  class Feeder[-T]
  val feeder: Feeder[Dog] = new Feeder[Animal]

  def main(args: Array[String]): Unit = {

  }

}
