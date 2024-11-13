public class EvenNumProductW {
    public static void main(String args[]){
        System.out.println("Even numbers product are:");
        int product=1;
        int i=1;
        while(i<=10){
            if(i%2==0){
                product*=i;
            }
            i++;
        }
        System.out.println(product);
    }
}
