Q1. Write a program to find Fibonacci series till a given limit using tail recursion.
For example: If limit is 7
Output: 0,1,1,2,3,5,8

Q2. Write a higher order function that takes three parameters with a function to calculate area of rectangle, rhombus and parallelogram. Also use string interpolation and pattern matching with default case.
For Example: 
def area(shape: String, first: Int, second: Int, f:(Int,Int) => Int):String

Input : area("rectangle",5,4,function)
Output : Area of rectangle is 20

Input : area("square",5,4,function)
Output : Not defined yet for square.

Q3 Using higher order functions, implement:
sum of squares
sum of cubes
sum of Ints
def sum(f: (Int, Int) => Int,a: Int, b:Int): Int
For example: 
Input: sum(sqaure function, 5 , 4)
Output: 41 (5*5 + 4*4)
Input: sum(Ints function, 5 , 4)
Output: 9 (5 + 4) 

