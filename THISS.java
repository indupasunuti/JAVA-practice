class THISS {
    void meth1()
    {
        System.out.println("this is method1...");
        meth2();
    }
    void meth2()
    {
        System.out.println("this is method2...");
    }
    public static void main(String args[])
    {
        new THISS().meth1();
    }
}
