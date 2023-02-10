import java.util.Scanner;
public class Palindrom {

    static boolean isPolindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while(temp!=0)
        {
            temp=temp%10;
            reverseNumber=(reverseNumber*10)+number;
            temp=temp/10;

        }
        if(reverseNumber==number) {return true;}
        else {return false;}
    }
    public static void main(String[] args) {
        System.out.println(isPolindrom(555));

    }
}
