def tailFactorial(n:Int): BigInt = {
  //@tailrec
  def accumulate(n:Int, value: BigInt) : BigInt = {
    if (n==0) 0
    else if (n == 1) value
    else accumulate(n-1, n*value)
  }
  accumulate(n,1)
}

println(tailFactorial(50))