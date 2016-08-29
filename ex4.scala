object Solution4 {


	// plan of attack: 100 to 999, multiply nested 100 to 999
	// check if the number is a palindrome with toString and isPalindrome
	// if integer value higher than current max, replace it.

	def isPalindrome(x: String): Boolean = {x == x.reverse}

	def main(args: Array[String]): Unit = {
		val palindromes = for (
			i <- 100 to 999
			val base = i
			q <- 100 to 999
			val product = base * q
			if isPalindrome(product.toString)
		) yield product
		println(palindromes)
	}



}
