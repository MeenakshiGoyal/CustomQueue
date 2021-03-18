package org.knoldus.queue

class Customqueue[T] {
  var front = 0
  var rear = 0
  def enqueue[T](list:List[T],Key:T):List[T] = {
     if (rear == -1) {
     front = front + 1
     }
     rear = rear+1
     val newList = list ::: List(Key)
     newList
   }
  def dequeue(list: List[T]) = {
   if (rear == -1 ) {                    //If queue is null
      print("Queue is Underflow")
   }
    else if(front == rear) {           //If queue have only one element
      val newList = list.drop(1)
      rear -= 1
      newList
    }
    else{
     val newList = list.drop(1)
      rear -= 1
      newList
      }
  }




}