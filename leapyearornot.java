public class leapyearornot {
    public static void main(String[] args){
        int year=2021;
        if(year%400==0){
            System.out.print("it is leap year");
        }
        else if(year%4==0 && year%100!=0){
             System.out.print("it is leap year");
        }
        else{
            System.out.print("it is not a  leap year");
        }
    }
}
