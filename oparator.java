public class oparator {
    int a=10;
    void meth()
    {
        System.out.println(++a); //11  a=11
        System.out.println(a++); //11  a=12
        a++; //13
        System.out.println(a--); //13  a=12
        System.out.println(a--); //12  a=11
        a--; //a=10
        System.out.println(--a); //9  a=9
        System.out.println(a++); //9   a=10
        ++a; //a=11
        System.out.println(a--); //11  a=10
        a--; //a=9
        System.out.println(--a); //8  a=8
        System.out.println(++a); //9  a=9
        System.out.println(a);   //9
    }
    public static void main(String[]args)
{
    oparator obj=new oparator();
    obj.meth();
}
}
