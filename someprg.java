class someprg{
    void meth1(int a,int b,int c)
    {
System.out.println("addition:"+(a+b+c));
new someprg().meth2(10,20);
    }
    void meth2(int a,int b)
    {
System.out.println("substration:"+(a-b));
    }
    someprg()
    {
        System.out.println("division:"+(10/2));
    }
    someprg(int a,int b)
    {
        System.out.println(a*b);
    }
public static void main(String[] args) {
   System.out.println("multiplication:");
    someprg obj=new someprg(10,20);
    obj.meth1(10,20,30);
}
}