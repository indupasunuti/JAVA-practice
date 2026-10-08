public class forloop {
    void meth1()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("value of i:"+i);
            i++;
        }
    }
   void meth2()
   {
    System.out.println("..........................");
    for(int i=1;i<=10;i++)
    {
        System.out.println("value of i is:"+ ++i);
        //i++;
    }
   }
   public static void main(String args[])
   {
    forloop obj=new forloop();
    obj.meth1();
    obj.meth2();
}
}