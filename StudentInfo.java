public class StudentInfo {
    int StdId;
    String SName;
    String StudentCity;
    int age;
    char Rank;
    public StudentInfo(int StdId, String SName, String StudentCity, int age, char Rank){
        this.StdId=StdId;
        this.SName=SName;
        this.StudentCity=StudentCity;
        this.age=age;
        this.Rank=Rank;
    } 
    void display(){
        System.out.println("StdId: "+this.StdId+"\n"+"SName: "+this.SName+"\n"+"StudentCity: "+this.StudentCity+"\n"+"Age"+this.age+"\n"+"Rank: "+this.Rank);
    }
    public static void main(String args[]){
        StudentInfo S1=new StudentInfo(13, "Vijay", "Kolkata", 24, 'A');
        S1.display();
    }
}
