public class PrimeNum1to10 {
    public static void main(String args[]){
        for(int i=1;i<=20;i++){
            int count=0;
            for(int n=1;n<=i;n++){
                if(i%n==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
        
    }
}
