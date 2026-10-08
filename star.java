public class star {
    void Rtriangle()
    {
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=i;j++)           
            {
                System.out.print("*  ");
            }            
                System.out.println();
            }
        }
        void Ltriangle(){
             for(int i=0;i<=5;i++){
            for(int j=0;j>=i;j--)           
            {
                System.out.print("*  ");
            }            
                System.out.println();
            }
        }
        void Uptriangle()
        {
         for(int i=0;i<=5;i++)
        {
            for(int j=5;j>=i;j--)           
            {
                System.out.print("*  ");
            }            
                System.out.println();
            }
        }
    public static void main(String args[])
    {
        star obj=new star();
         System.out.println("Right  triangle");
        obj.Rtriangle();
        System.out.println("upper triangle");
        obj.Uptriangle();
    }  
}
