public class table {
    void meth1(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+ "*" +i+ "=" +(i*num));
        }
    }
    public static void main(String args[])
    {
        table obj=new table();
        obj.meth1(4);
    }
}    

