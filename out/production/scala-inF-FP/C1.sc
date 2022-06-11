// A comments!
/* Another comments */
/** A documenttation comment */

object MyModule {
  def abs(n : Int) :Int =  {
    if (n < 0) -n
    else n
  }

  private def formatAbs(x: Int): String = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def main(args:Array[String])  = {
    println(formatAbs(-42))
  }
}
MyModule abs -42
MyModule.abs(-42)

def factorial(n:Int) = {
  def go(n:Int, acc:Int):Int = {
    if (n <= 0) acc
    else go(n-1, n * acc)
  }

  go(n, 1)
}

def fib(n:Int) :Int = {
  @annotation.tailrec
  def go(n:Int, acc:Int, n_1: Int = 1):Int = {
    if (n == 0) acc
    else {
      val tmp = acc
      go(n-1, acc + n_1, tmp)
    }
  }
  go(n, acc = 0)
}

fib(12)