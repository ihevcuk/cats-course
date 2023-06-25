package part1intro.my

object CatsIntro {

  def main(args: Array[String]): Unit = {
    import cats.Eq
    import cats.instances.int._

    val areEqual = Eq[Int].eqv(2,2)
    println(areEqual)

    import cats.syntax.eq._

    case class Person(name: String, age: Int)

    implicit val personEq: Eq[Person] = Eq.instance[Person] {
      (personA, personB) => personA == personB
    }

    val compare = Person("igor", 35) === Person("igor", 35)
    println(compare)
  }

}
