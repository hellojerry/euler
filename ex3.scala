object Solution3 {

	def main(args: Array[String]): Unit = {
		var n = 600851475143L
		var i = 2L
		while (i*i <= n){
			if (n % i != 0){
				i += 1L
			}else {
				n /= i
			}
		}
		println(n)
	}
}
