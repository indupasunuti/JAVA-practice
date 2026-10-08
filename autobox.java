public class autobox {
    void meth()
    {
        int i=10;
        Integer val1=Integer.valueOf(i);
           System.out.println("AUTOBOXING OF INT");
        System.out.println("primitive data type:"+i);
          System.out.println("wrapper class object:"+val1); 
          System.out.println("---------------------------"); 
           char c='P';
        Character c1=Character.valueOf(c);
         System.out.println("AUTOBOXING OF char");
          System.out.println("primitive data type value :"+c);
        System.out.println("wrapper class value:"+c1);
          System.out.println("---------------------------"); 
           byte b=100;
        Byte b1=Byte.valueOf(b);
         System.out.println("AUTOBOXING OF BYTE");
           System.out.println("primitive data type value :"+b);
          System.out.println("wrapper class object:"+b1); 
          System.out.println("---------------------------");
          boolean bool=true;
        Boolean boole=Boolean.valueOf(bool);
         System.out.println("AUTOBOXING OF BOOLEAN");
           System.out.println("primitive data type value :"+bool);
          System.out.println("wrapper class object:"+boole); 
    }
    public static void main(String[] args)
    {
        autobox obj=new autobox();
        obj.meth();
    }
}
