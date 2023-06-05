import java.util.Scanner;

public class no_Of_Words {
    public static void main(String args[]){
        System.out.println("Enter string sentence: ");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        int count=1;

        for(int i=0;i<str.length()-1;i++){
            if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("Number of words in a given string :  "+count);
    }
}
