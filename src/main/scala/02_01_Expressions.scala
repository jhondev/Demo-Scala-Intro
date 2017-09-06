// compound expression
val c = {
  val i = 2 // basic expression
  val j = 4 / i
  i * j
}

println(c)

if (c == 4) {
  println("is four!!")
}

val maxValue = 3
val isGTFive = c > maxValue

if (!isGTFive) {
  println(s"is less than $maxValue")
} else {
  println(s"is greater than $maxValue")
}