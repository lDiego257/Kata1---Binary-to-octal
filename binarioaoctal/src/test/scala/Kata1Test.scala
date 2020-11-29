class Kata1Test extends org.scalatest.funsuite.AnyFunSuite {
  test("binary2decimal.11001000_Es_200Decimal") {
    assert(Kata1.binary2decimal(11001000) == 200)
  }
    test("binary2decimal.001111101000_Es_1000Decimal") {
    assert(Kata1.binary2decimal(001111101000) == 1000)
  }
      test("binary2octal.001110000011_Es_1603Octal") {
    assert(Kata1.binary2octal(001110000011) == 1603)
  }
        test("binary2octal.001101110111_Es_1567ctal") {
    assert(Kata1.binary2octal(001101110111) == 1567)
  }
}
