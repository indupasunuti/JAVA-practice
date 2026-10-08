class THIS
{
    int a=10;
    static int b=20;
void meth()
{
    int a=30;
    int b=40;
    System.out.println("instance variable:" +a);
    System.out.println("static variable:" +this.a);
    System.out.println("static variable:"+b);
    System.out.println("local variable:" +b);
}
public static void main(String args[])
{
    THIS obj=new THIS();
    obj.meth(); 
}
}