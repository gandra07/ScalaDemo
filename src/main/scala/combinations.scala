/*

Created by Venkatesh Gandra on 10/14/20

*/
object combinations {

  def nCr(n: Int, r: Int) = {
    def fact(i: Int) = {
      var res = 1
      for(e <- i to 1 by -1)
        res = res * e
      res

    }
    fact(n)/(fact(n-r)*fact(r))
  }

  def main(args: Array[String]): Unit = {
    val n = args(0).toInt
    val r = args(1).toInt
    val c = nCr(n,r)

    println("There are " + c + " combinations of "+ r + " in " + n + " elements")
  }
}
