public class STRING {
    void meth()
    {
        String s1="java";
        String s2=new String("java");
        char arr[]={'j','a','v','a'};
        String s3=new String(arr);
        String s4=new String(arr,2,2);
        System.out.println("s1=" +s1);
        System.out.println("s2=" +s2);
        System.out.println("s3=" +s3);
        System.out.println("s4=" +s4);
    }
    public static void main(String args[])
    {
        STRING obj =new STRING();
        obj.meth();
    }
}