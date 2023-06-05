import java.util.*;

public class Duplicatechar {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] array=str.toCharArray();
        System.out.println("The string is : "+str);
        System.out.println("Duplicate characters in above string are : ");
        
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(array[i]==array[j]){
                    System.out.print (array[j]+" ");
                    break;
                }
            }
        }
    }
}
