import java.util.Scanner;
public class palindrome {
    public static void palindrome(String z)
    {
        String y="";
        int i=z.length()-1;
        while(i>=0)
        {
            y+=z.charAt(i);
            i--;
        }
        //System.out.println(y);
        if(z.equals(y))
        {
            System.out.println("its polindrome");
        }
        else{
            System.out.println("its not polindrome");
        }
    }
    public static void main(String[]args)
    {
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter a word to Check=");
    String x=sc.nextLine();
    palindrome(x);
    }
}
