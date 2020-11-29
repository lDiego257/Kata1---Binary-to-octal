class Kata1Test extends org.scalatest.funsuite.AnyFunSuite {
  test("binary2decimal.11001000_Es_200Decimal") {
    assert(Kata1.binary2decimal(11001000) == 200)
  }
    test("binary2decimal.001111101000_Es_1000Decimal") {
    assert(Kata1.binary2decimal(001111101000) == 1000)
  }
}
