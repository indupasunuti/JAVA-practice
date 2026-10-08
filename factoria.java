public class factoria {
    void meth1(int num)
    {
        int factorial=1;
        for(int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
        System.out.println("factorial of "+num+" is " +factorial);
    }
    public static void main(String args[])
    {
        factoria obj=new factoria();
        obj.meth1(4);
    }
}
