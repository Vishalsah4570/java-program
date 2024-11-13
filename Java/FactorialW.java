public class FactorialW {
    public static void main(String args[]){
        int factorial=1;
        int i=5;
        while(i>=1){
            factorial*=i;
            i--;
        }
        System.out.println(factorial);
    }
}
