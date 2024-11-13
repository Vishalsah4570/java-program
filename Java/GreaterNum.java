public class GreaterNum {
    public static void operation(){
        int x=25;
        int y=30;
        int z=maximum(x,y);
        System.out.println("The greater number between two number is "+z);
    }
    public static int maximum(int a,int b){
        int ans;
        ans=(a>b)?a:b;
        return ans;
    }
public static void main(String [] args){
        operation();
    }
}
