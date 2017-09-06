// println(multiplyTwoNumbers(2, 3))
val nameUppercased = getFormattedName("Michel Jordan")
val nameNotUppercased = getFormattedName("Jhonattan")
println(s"${nameUppercased._1} - length: ${nameUppercased._2} | ${nameNotUppercased._1} - length: ${nameNotUppercased._2}")

def multiplyTwoNumbers(firstNumber: Int, secondNumber: Int): Int = {
    firstNumber * secondNumber
}

def getFormattedName(name: String): (String, Int) = {
  val nameLength = name.length()
  if (nameLength > 10) {
    (name.toUpperCase(), nameLength)
  } else {
    (name, nameLength)
  }
}
