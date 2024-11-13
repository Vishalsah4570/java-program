class ArmStrongNum{
    public static void main(String args[]){
        int num=153;
        int temp=num;
        int memp=num;
        int count=0;
        double result=1;
        int sum=0;
        while(memp>0){
            int last=memp%10;
            count++;
            memp/=10;
        }
        while(temp>0){
            int last2=temp%10;
            result=Math.pow(last2, count);
            sum+=result;
            temp/=10;
        }
        if(sum==num){
            System.out.println("ArmStrong Number");
        }else{
            System.out.println("Not a ArmStrong Number");
        }
    }
}   