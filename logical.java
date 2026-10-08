public class logical {
    void meth1(int marks)
    {
        if(marks>=35 || marks<=91)  //21>=35 --> f  21<=91--> t
        {
            System.out.println("outstanding perforamnce");
        }
            else
            {
                System.out.println("NOt outstanding performance:");
            }
        }
            public static void main(String arg[])
{
    logical obj1=new logical();
    obj1.meth1(98);
}
}


            
        
        

    
    

