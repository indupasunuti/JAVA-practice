class indu {
    void meth1(int num)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+ "*" +i+ "=" +(i*num));
        }

    }
    public static void main(String args[])
    {
        indu navya=new indu();
        navya.meth1(36);
    }
}