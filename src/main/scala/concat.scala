
def concatString(s:String,howMany:Int):String = {
  def concat(original:String,newString:String,howMany:Int) : String= {
    if(howMany==0) newString
    else concat(original,s"$newString$original", howMany-1)
  }
  concat(s,"",howMany)
}

println(concatString("test_string:",500))