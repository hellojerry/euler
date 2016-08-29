object Solution2 {

	def main(args: Array[String]): Unit = {
		fib(1,2,2)
	}

	private def checkSum(next: Int, tally: Int): Int = {
		if (next % 2 == 0){
			next + tally
		} else {
			tally
		}

	}

	private def fib(twoPrev: Int, prev: Int, tally: Int): Int = {
		val next = twoPrev + prev
		val newTally = checkSum(next, tally)
		println(tally)
		if (next >= 4000000) {
			tally
		} else {fib(prev, next, newTally)} 
	}
}
