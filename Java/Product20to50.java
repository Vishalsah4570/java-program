public class Product20to50 {
    public static void main(String args[]){
        int n=50;
        long product=1;
        for(int i=20;i<=n;i++){
            product*=i;
        }
        System.out.println(product);
    }
}
