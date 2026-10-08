public class varia {
    int x;
    static int y;
    int a=10;        //instance variable
    static int b=20; 
 void meth1()
    {
        int c=40;
        System.out.println("thi is method 1----");
        System.out.println("instance variable x:" +x);
        System.out.println("static variable a:" +y);
        System.out.println("--------------------------------");
        System.out.println("static variable a:"+a);
    System.out.println("instance variable a:" +new varia().a);
    System.out.println("static variable b:" +b);
    System.out.println("static variable b:" +new varia().b);
    System.out.println("static variable b:" +varia.b);
    System.out.println("local variable c:" +c);  
}
void meth2(){
    int a=100;
    int b=200;
    System.out.println("this is method 2---");
    System.out.println("instance variable a:" +a);
    System.out.println("static variale b:" +b);
    System.out.println("local variable a:" +a);
    System.out.println("local variable b:" +b);
}
public static void main(String args[])
{
    varia obj=new varia();
    obj.meth1();
    System.out.println("==========================");
    obj.meth2();
    System.out.println("===========================");
}
}



