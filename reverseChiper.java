import java.util.Scanner;

public class reverseChiper {
    public static void main(String args[]) {
        System.out.println("Enter String to reverse");
        Scanner read = new Scanner(System.in);
        String str = read.nextLine();
        System.out.println("You Entered :" + str);
        StringBuilder sb = new StringBuilder();
        for(int i = str.length() - 1 ;i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println("The Reverse String is: "+sb.toString());
    }
}