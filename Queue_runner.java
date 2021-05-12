public class Queue_runner{
   
     public static void main(String[] args)
      {
        Queue q = new Queue();
         q.enQueue(18);
         q.enQueue(9);            
         q.enQueue(34);
         q.enQueue(65);          
         
         q.deQueue();
         q.deQueue(); 
         System.out.println(q.isEmpty());
         q.enQueue(32);
         System.out.println(q.isFull());
         System.out.println("size is : " + q.getSize());
         q.show();

  }
}