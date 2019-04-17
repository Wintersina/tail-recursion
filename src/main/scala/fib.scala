def calFibanacho(n:Int):Int = {
// a fib is when the next number is the sum of the pervious 2 numbers
  def sum(i:Int,left:Int,right:Int) :Int = {
    if(i>=n) right
    else sum(i+1, right, left+right)
  }
  if(n<=2) 1
  else sum(2,1,1)
}

println(calFibanacho(3))
// 1 1 2 3 5 8 13
// 1    1    (2     3)
// 1    2     3     4
// n    n+1  n+2    n+3