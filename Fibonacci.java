public class Fibonacci {
    public static void main(String args[]){
        int first=0; int second=1; int result=0;
        for(int i=1;i<=10;i++){
            System.out.print(first+",");
            result=first+second;
            first=second;
            second=result;
        }
    }
}
