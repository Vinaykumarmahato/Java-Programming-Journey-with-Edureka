public class callByReference
{
   int data=20;
    public void functionDemo (callByReference test)
      {
         test.data = test.data * 2;
      }
     public static void main (String args[])
      {
        callByReference c1 = new callByReference();
        System.out.println ("Before calling the function : "+c1.data);
        c1.functionDemo (c1);
        System.out.println ("After calling the function : "+c1.data);
       }
}  
