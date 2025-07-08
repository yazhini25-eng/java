public class palindrome {
    public static void main(String[] args){
        int originalnum=1221;
        int num=originalnum;
        int reverse=0;
        while(num!=0){
           int remainder=num%10;
            reverse=reverse*10+remainder;
            num=num/10;
        }
            if(originalnum==reverse){
                System.out.print("Palindrome number");
            }
            else{
                System.out.print("Not Palindrome number");
            }
        }
    }

