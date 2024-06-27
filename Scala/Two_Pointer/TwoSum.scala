import scala.collection.mutable
import scala.util.control.Breaks._

object Solution extends App {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val map = mutable.Map[Int, Int]()

    for (i <- nums.indices) {
      val complement = target - nums(i)
      if (map.contains(complement)) {
        return Array(map(complement), i)
      }
      map(nums(i)) = i
    }

    throw new IllegalArgumentException("No two sum solution")
  }

  // Example usage
  val nums = Array(2, 7, 11, 15)
  val target = 9
  val result = twoSum(nums, target)
  println("Scala solution")
  println(result.mkString("[", ", ", "]"))
}
