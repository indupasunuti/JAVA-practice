public class constructer {
    String studentname;
    int studentroll;
    String studentdept;
    constructer(String name,int id,String dept)
{
    studentname=name;
    studentroll=id;
    studentdept=dept;
}
public static void main(String[]args)
{
    constructer obj1=new constructer("indu",100,"cse");
    constructer obj2=new  constructer("chinu",101,"csd");
    constructer obj3=new  constructer("honey",102,"csm");
    System.out.println(obj1.studentname+"  "+obj1.studentroll+"  "+obj1.studentdept+"  ");
    System.out.println(obj2.studentname+"  "+obj2.studentroll+"  "+obj2.studentdept+"  ");
    System.out.println(obj3.studentname+"  "+obj3.studentroll+"  "+obj3.studentdept+"  ");
}
}
