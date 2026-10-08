public class increment {
        void meth()
        {
            int a=34;
            int b=21;
            int c=a++ + ++b;
            int d=--a + --b + c--;
            System.out.println("value of c:"+c);
            System.out.println("value of d:"+d);
        }
        public static void main(String[]args)
        {
            new increment().meth();
        }
        }
        
    
    
    

