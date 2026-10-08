public class sample {
    void meth(){
        int num=3675;
        if(num%2==0){
            System.out.println("it is odd");
        }
            else{
                System.out.println("it is even");
            }
        }
    public static void main(String args[]){
        sample obj=new sample();
        obj.meth();
    }  
}
