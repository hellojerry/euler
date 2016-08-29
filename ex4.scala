object Solution4 {

	def isPalindrome(x: String): Boolean = {x == x.reverse}

	def main(args: Array[String]): Unit = {
		val palindromes = for (
			i <- 100 to 999;
			q <- 100 to 999;
			product = i * q
			if isPalindrome(product.toString)
		) yield product
		println(palindromes.reduceLeft(_ max _))
	}
}
