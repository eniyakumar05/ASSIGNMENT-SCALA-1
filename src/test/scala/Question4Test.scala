import org.scalatest.flatspec.AnyFlatSpec

class Question4Test extends AnyFlatSpec{

  it should "match" in {
  assert("if else"== Question4.test(str = "if else"))
  assert("if else" == Question4.test(str = "else"))


  }
}
