import java.util.Scanner;
public class recursive_fibonacci {
    static  int fib(int n){
       if(n==1||n==2)
       {
           return 1;
       }
        return fib(n-1)+fib(n-2);



    }

    public static void main(String[] args) {
 int n;
        System.out.print("finobacci kacıncı değeri getirilsin :");
        Scanner input=new Scanner(System.in);
        n=input.nextInt();
        System.out.println(fib(n));
    }
}
