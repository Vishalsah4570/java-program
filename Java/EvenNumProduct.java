public class EvenNumProduct {
    
        public static void main(String args[]){
            System.out.println("Even numbers product are:");
            int product=1;
            for(int i=1;i<=10;i++){
                if(i%2==0){
                    product*=i;
                }
            }
            System.out.println(product);
        }
    }
