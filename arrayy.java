public class arrayy {
    void meth1()
    {
        int arr[]={10,20,30,40,50};
        System.out.println("element present at 0th index:" +arr[0]); 
        System.out.println("element present at 1th index:" +arr[1]); 
        System.out.println("element present at 2th index:" +arr[2]); 
        System.out.println("element present at 3th index:" +arr[3]); 
        System.out.println("element present at 4th index:" +arr[4]); 
        System.out.println("retrieving data from using forloop"); 
    for(int index=0;index<=4;index++)
    {
        System.out.println(arr[index]);
    }
    System.out.println("retreiving data in reverse order");
    for(int index=4;index>=0;index--)
    {
        System.out.println(arr[index]);
    }
}
    public static void main(String[]args)
    {
        arrayy obj=new arrayy();
        obj.meth1();
    }
}
