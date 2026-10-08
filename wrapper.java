public class wrapper {
    void meth1()
    {
        System.out.println("implimenting autoboxing");
        int i=20;
       Integer ival1 =Integer.valueOf(i);
       Integer ival2=Integer.valueOf("100");
       System.out.println("int value of PDT:" +i);
       System.out.println("int value of WCO:"+ival1);
       System.out.println("int value of WCO:"+ival2);
       System.out.println("...................");

    byte b=20;
    Byte bval1=Byte.valueOf(b);
    Byte bval2=Byte.valueOf("23");
    System.out.println("byte value of PDT:" +b);
       System.out.println("byte value of WCO:"+bval1);   
       System.out.println("byte value of WCO:"+bval2);
       System.out.println(".......................");

       char c='A';
       Character cval1=Character.valueOf(c);
       System.out.println("char PDT value:"+cval1);
    }
public static void main(String args[])
{
wrapper obj=new wrapper();
obj.meth1();
}
}