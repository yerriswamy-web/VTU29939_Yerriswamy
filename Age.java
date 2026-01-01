import java.util.*;
class Age{
    public static void main(String args[]){
        System.out.println("Enter your age");
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a>18){
            System.out.println("your are Eligible for vote");
        }
        else{
            System.out.println("your are not Eligible for vote");
            
        }

    }
}