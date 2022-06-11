def findFirst(ss: Array[String], key:String): Int = {
  @annotation.tailrec
  def loop(n: Int): Int = {
    if (n >= ss.length) -1
    else if (ss(n) == key) n
    else loop(n + 1)
  }
  loop(0)
}

def findFirst[A](as: Array[A], p: A => Boolean): Int = {
  @annotation.tailrec
  def loop(n: Int): Int = {
    if (n >= as.length) -1
    else if (p(as(n))) n
    else loop(n + 1)
  }
  loop(0)
}

// Exercise 2.2
def isSorted[A](as: Array[A], ordered: (A,A) => Boolean) : Boolean = {
  @annotation.tailrec
  def loop(n:Int) : Boolean =
    if(n >= as.length - 1) true
    else if (ordered(as(n),as(n+1))) loop(n+1)
    else false
  loop(0)
}

// 2.5.2
findFirst(Array(7, 9, 13), (x: Int) => x == 9) // function literal
(x: Int, y: Int) => x == y
res1.apply(12,12)

def partial1[A, B, C](a:A, f: (A,B) => C) : B => C =
  (b: B) => f(a, b)

// Exercise 2.3
def curry[A,B,C] (f: (A,B) => C) : A => (B => C) =
  (a: A) => ((b: B) => f(a,b))

// Exercise 2.4
def uncurry[A,B,C] (f: A => B => C) : (A,B) => C =
  (a:A,b:B) => f(a:A)(b:B)

// Exercise 2.5
def compose[A, B, C](f:B => C, g: A => B): A => C =
  (a: A) => f(g(a: A))

val f = (x: Double) => math.Pi / 2 - x
val cos = f andThen math.sin
cos(1)