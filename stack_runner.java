public class stack_runner{
   public static void main(String[] args)
  {
     Stack nums = new Stack();
     System.out.prinltn("empty = "+ nums.isEmpty()); 
     nums.push(15);
     nums.push(34);
     System.out.println(nums.peek());
     nums.push(21);
     System.out.println(nums.pop());
     System.out.println("size is" + nums.size());
     System.out.prinltn("empty = "+ nums.isEmpty());    
     nums.show();
   }

}