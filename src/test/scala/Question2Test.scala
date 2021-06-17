import org.scalatest.flatspec.AnyFlatSpec

class Question2Test extends AnyFlatSpec {

  it should "match" in {
    assert("sala" == Question2.test(str = "scala",1))
    assert("cala" == Question2.test(str = "scala",0))
    assert("scal" == Question2.test(str = "scala",4))
  }
}


