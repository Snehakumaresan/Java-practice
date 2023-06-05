import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){

        System.out.println("Enter the input: ");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();

        String reverseStr="";
        int strLength = str.length();

        for(int i=(strLength-1);i>=0;--i){
            reverseStr = reverseStr+str.charAt(i);
        }

        if (str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        sc.close();
    }
}
