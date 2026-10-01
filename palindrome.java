import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int temp=num;
        int reverse=0;
        while(temp!=0){
            reverse=(reverse*10)+(temp%10);
            temp=temp/=10;
        }
        if(reverse==num){
            System.out.println("is palindrome "+ reverse);
        }
        else{
            System.out.println("not a plaindrome");
        }
    }
    
}