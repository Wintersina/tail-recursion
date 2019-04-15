def prime(n:BigInt): Boolean = {
  def check(n:BigInt,count:BigInt): Boolean ={
    println(count)
    if(n==count) true
    else if(n%count==0) false
    else check(n,count+1)
  }
  if(n==1) false
  else check(n,2)
}

println(prime(2147483647))
