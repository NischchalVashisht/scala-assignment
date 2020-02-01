package com.knoldus

class Sum {
  def square_sum(first:Int,second:Int):Int = first*first + second*second
  def cube_sum(first:Int,second:Int):Int = first*first*first + second*second*second
  def int_sum(first:Int,second:Int):Int = first + second

  def sum(function:(Int,Int) => Int, first:Int,second:Int):Int={
    function(first,second)
  }

  def choose_sum(choice:Int, first:Int, second:Int):Unit ={
    choice match{
      case 1 => println(sum(int_sum,first,second) + s" ($first + $second)")
      case 2 => println(sum(square_sum,first,second) + s" ($first*$first + $second* $second)")
      case 3 => println(sum(cube_sum,first,second) + s" ($first*$first* $first + $second* $second* $second)")
    }
  }
}

object Sum extends App{
    val sum = new Sum()
    println("Choose one of the following:" +
    "1.Sum of Integers" +
    "2.Sum of Squares of Integers" +
    "3. Sum of Cubes of Integers")
    val choice:Int = scala.io.StdIn.readInt()
    println("Enter first number")
    val first:Int = scala.io.StdIn.readInt()
    println("Enter second number")
    val second:Int = scala.io.StdIn.readInt()
    sum.choose_sum(choice,first,second)


}
