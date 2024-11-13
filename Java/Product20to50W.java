public class Product20to50W {
    public static void main(String args[]){
        int n=50;
        long product=1;
        int i=20;
        while(i<=n){
            product*=i;
            i++;
        }
        System.out.println(product);
    }
}
