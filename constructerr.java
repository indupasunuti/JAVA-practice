public class constructerr {
    void meth()
    {
        System.out.println("this is method..");
    }
    constructerr(int a)
    {
        System.out.println("parameterised constructer " +a);
    }
    constructerr(){
        System.out.println("default constructer");
    }
    public static void main(String[]args)
    {
constructerr obj=new constructerr(500);
new constructerr();
obj.meth();
    }

}
