public class ThisKeyword {
    int a;
    ThisKeyword(int a){
        this.a=a;
    }
    void display(){
        System.out.println(a);
    }
    public static void main(String args[]){
        ThisKeyword T= new ThisKeyword(100);
        T.display();
    }
}
