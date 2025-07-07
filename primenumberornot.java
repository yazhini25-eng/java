public class primenumberornot {
    public static void main(String[] args){
        int count=0;
        int num=6;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
   if(count==2){
                System.out.print("prime number");
    }else{
                System.out.print("not a prime number");
            }
        }
    }

