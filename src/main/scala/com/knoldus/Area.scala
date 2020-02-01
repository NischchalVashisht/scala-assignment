package com.knoldus

class Area {
  def area( first:Int, second:Int, function:(Int,Int)=>Int):Int={
    function(first,second)

  }

  def call(shape:String,first:Int,second:Int):Unit={
    shape match{
      case "rectangle" =>  println(s"The area of $shape is :" + area(first, second ,(a,b)=> a*b))
      case "rhombus" =>  println(s"The area of $shape is :" + area(first,second,(a,b)=> (a*b)/2))
      case "parallelogram" =>  println(s"The area of $shape is :" + area(first,second,(a,b)=> a*b))
      case _ => println(s"Area of $shape can't be calculated")
    }
  }

}

object Area extends App{
  val area = new Area()
  println("Which shape's area you want?")
  val shape:String = scala.io.StdIn.readLine()
  println("Enter first dimension")
  val first:Int = scala.io.StdIn.readInt()
  println("Enter second dimension")
  val second:Int = scala.io.StdIn.readInt()
  area.call(shape,first,second)

}