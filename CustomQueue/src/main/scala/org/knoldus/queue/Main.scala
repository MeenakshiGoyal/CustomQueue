package org.knoldus.queue
object Main extends App {
  val customQueue = new Customqueue[Int]
  println("Queue elements are:")
  val queue = customQueue.enqueue(List(), 1)
  val newQueue = customQueue.enqueue(queue, 2)
  val newQueueList = (customQueue.enqueue(newQueue, 3))
  println(newQueueList)
  println("After dequeue :" + customQueue.dequeue(newQueueList))
}
