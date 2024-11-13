public class PrimeOrNotW {
    public static void main(String [] args){
        int n=10;
        int count=0;
        int i=1;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println("Prime Number");
        }else{
            System.out.println(" Not Prime Number");
        }
    }
}
