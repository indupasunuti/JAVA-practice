public class selection {
        void meth1(int a)
        {
            if(a<=20)
            {
                System.out.println("helo!!!!!");
                System.out.println("value is:" +a);
            }
            System.out.println("meth1 is executed....");
        }
        void meth2(int b)
        {
            if(b<=30)
            System.out.println("hii!!!");
            System.out.println("value is:"+b);
            System.out.println("meth2 executed....");
        }
            public static void main(String[] args)
            {
                System.out.println("control statements............");
                selection obj=new selection();
                obj.meth1(10);
                obj.meth2(200);
            }
        }
    
    
        
  

