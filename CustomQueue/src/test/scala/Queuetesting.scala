import org.knoldus.queue.Customqueue
import org.scalatest.flatspec.AsyncFlatSpec

class Queuetesting extends AsyncFlatSpec {
  val customqueue = new Customqueue[Int]

  "Enqueue" should "add a element in a queue" in {
    val result = customqueue.enqueue(List(), 1)
    assert(result == List(1))
  }
  "Dequeue" should "delete a first element in a queue" in {
    val list = customqueue.enqueue(List(1), 2)
    val result = customqueue.dequeue(list)
    assert(result == List(2))
  }
}