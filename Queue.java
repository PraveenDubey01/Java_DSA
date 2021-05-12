public class Queue{
    int queue[] = new int[10];
    int size=0;
    int front=0;
    int rear=0;
    public void enQueue(int data)
    {  
      if(!isFull())
        {
          queue[rear] = data;
          rear = (rear+1)%10;
          size++;
         }
      else
        System.out.println("Queue is full"); 
     }
    public int deQueue()
     {
        int data = queue[front];
        if(!isEmpty())
         {
           front= (front+1)%10;
           size--; 
          }
        else 
         System.out.println("Queue is Empty");
       return data;
      }
    public void show()
    {
       System.out.print   ("elements are : ");
       for(int i=0;i<size;i++)
           System.out.print(queue[(front+i)%10] +" ");
       System.out.println();
       for(int n :queue)
        System.out.print(n +" ");  
     }
    public int getSize()
    {
      return size;
     }
    public boolean isEmpty()
     {
      return getSize()==0;
     }
    public boolean isFull()
     {
      return getSize()==10;
     }
} 