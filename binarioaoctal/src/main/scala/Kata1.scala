import scala.language.postfixOps

object Kata1 extends App {
  def binary2decimal(x: Int) = {
    var binary = x
    var i = 0.0
    var decimal = 0

    while(binary != 0){
      decimal = decimal + (binary%10) *  Math.pow(2,i).toInt
      i = i + 1
      binary = binary/10
    }
    decimal
  }
}