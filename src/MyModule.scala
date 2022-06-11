// A comments!
/* Another comments */
/** A documenttation comment */

object MyModule {
  def abs(n : Int) :Int =  {
    if (n < 0) -n
    else n
  }

  def factorial(n:Int) = {
    def go(n:Int, acc:Int):Int = {
      if (n <= 0) acc
      else go(n-1, n * acc)
    }
    go(n, 1)
  }


  private def formatAbs(x: Int): String = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }
  private def formatFatorial(n: Int):String = {
    val msg = "The facotrial of %d is %d"
    msg.format(n, factorial(n))
  }

  def main(args:Array[String])  = {
    println(formatAbs(-42))
    println(formatFatorial(7))
  }
}

