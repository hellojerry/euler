object Solution1 {
	def main(args: Array[String]): Unit = {
		val solution = for (
			i <- 1 to 999 
			if i % 3 == 0 || i %5 == 0
		) yield i
		println(solution.sum)
	}
}
