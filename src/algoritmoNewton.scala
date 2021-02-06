

object algoritmoNewton {
  
    def main(args: Array[String]):Unit={
    def f(x:Double, n:Int): Double = Math.pow(x,2) - n

    def dx(x: Double): Double = 2 * x

    def raizCuadrada(n: Int): Double = {
      var x = 1.0
      (1 to 25).foreach(i => x = x - f(x, n) / dx(x))
      x 
    }
    
    print ("RESULTADO: " + raizCuadrada(2))
  }
}