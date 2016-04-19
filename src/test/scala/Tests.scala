import org.scalatest.WordSpec

class Tests extends WordSpec {

  "Testing" should {

    "Pass" in {
      assert(true)
    }

    "Fail" in {
      throw new RuntimeException("A failure occurred. Surprise!")
    }

  }

}