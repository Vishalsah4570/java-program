public class Max {
    public static void Num(){
        int a=10;
        int b=15;
        int c=maximum(a,b);
        System.out.println("The greater of two number is "+c);
    }
    public static int maximum(int x,int y){
        int ans=(x<y)? y:x;
        return ans;
    }
    public static void main(String args[]){
        Num();
    }
}
