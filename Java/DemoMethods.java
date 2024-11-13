public class DemoMethods {
    public static void demoMethodTest(){
        int x=85;
        int y=26;
        int z=maximum(x,y);
        System.out.println("The larger one is "+z);
    }
    public static int maximum(int a,int b){
    int ans;
    ans=(a>b)? a:b;
    return ans;
 }
 public static void main(String[]args){
    demoMethodTest();
 }
}
