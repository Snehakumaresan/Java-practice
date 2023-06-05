import java.util.Scanner;

public class Reversetri{
    public static void main(String args[]) {

        System.out.println("Enter no of rows : ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=n;i<j;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }sc.close();
}}
