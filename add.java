class Add 
{
public void addd()
   {
    int a=1,b=10;
    int sum=a+b;
    System.out.println("addition of numbers:"+sum);
    System.out.println("multiplication:"+(a*b));
   }
   public void sub()
    {
      int a=16;
      System.out.println("subtraction:"+(20-a));
    }
    public void mul()
    {
      int a=20,b=30;
      System.out.println("multiplication:"+(a*b));
    }
    public void div()
    {
      System.out.println("division:"+(10/2));
    }
    public static void main(String args[])
    {
      System.out.println("hello arthmetic");
      Add A=new Add();
      A.addd();
      Add B=new Add();
      B.sub();
      Add C=new Add();
      C.mul();
      Add D=new Add();
      D.div();
    }
   }
