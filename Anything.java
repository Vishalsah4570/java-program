public class Anything {
    int num;
    Anything(int a){
        num=a;
    }
    public static void main(String args[]){
        Anything b=new Anything(10);
        System.out.println(b.num);
    }
}
