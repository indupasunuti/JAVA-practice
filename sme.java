public class sme {
    String meth(int a,int b)
    {
        System.out.println("value of a:"+a);
        System.out.println("value of b:"+b);
        return "hii";
    }
    public static void main(String argds[])
    {
        sme obj=new sme();
        System.out.println("--->"+obj.meth(30,40));
    }
}
