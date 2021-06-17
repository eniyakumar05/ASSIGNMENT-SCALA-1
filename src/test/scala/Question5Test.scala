import org.scalatest.flatspec.AnyFlatSpec

class Question5Test extends AnyFlatSpec {

  it should "match" in {
    assert(95 == Question5.test(78,95))
    assert(0 == Question5.test(95,95))
    assert(99 == Question5.test(99,70))
  }
}

