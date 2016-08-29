object Solution5 {

	def main(args: Array[String]): Unit = {
		val q = (20 to Int.MaxValue)
		.find(n => Range(11, 21).forall(n % _ == 0)).get
		println(q)
	}
}
