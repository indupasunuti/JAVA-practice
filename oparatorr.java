public class oparatorr {
    void meth()
    {
        int a=1;
    int b=2;
    int c;
    int d;
    c=++a;  
    d=b++;  
    c++;
    System.out.println("a = " +a);  // 2
    System.out.println("b = " +b);  // 3
    System.out.println("c = " +c);  // 3
    System.out.println("d = " +d);  // 2
    }
    public static void main(String[]args)
    {
        new oparatorr().meth();
    }
    }

