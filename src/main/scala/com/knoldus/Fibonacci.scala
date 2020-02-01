package com.knoldus

class Fibonacci {
  def fib(n:Int):Int = {
    @scala.annotation.tailrec
    def fib_help(a:Int, b:Int, n:Int):Int={
      println(a)
      if (n-1 > 0)
        fib_help(b, a + b, n - 1)

      else a
    }
    fib_help(0, 1, n)
  }

}

object Fibonacci extends App{
  val fibonacci = new Fibonacci()
  println("Enter the number you want to find the fibonacci series for :")
  val index :Int = scala.io.StdIn.readInt()
  fibonacci.fib(index)
}
