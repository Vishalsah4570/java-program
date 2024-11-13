public class StrongNum {
    public static void main(String args[]){
        int num=145;
        int temp=num;
        int sum=0;
        while(num>0){
            int last=num%10;
            int fact=1;
            int i=1;
            while(i<=last){
                fact=fact*i;
                i++;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
}
