import java.util.Scanner;

class  Reverse{
    public static void stringReverse(String s){
        for (int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=scanner.next();
        stringReverse(s);
    }
}
