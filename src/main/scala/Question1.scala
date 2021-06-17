object Question1{
  def test(str1: String): String =
  {
    if (str1.length < 2) str1
    else str1.substring(0, 2) * 4
  }
  def main(args: Array[String]): Unit = {
    println(test("india"))

  }
}


