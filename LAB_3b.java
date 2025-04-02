import java.util.Scanner;
public class LAB_3b {
    public static void main(String[] args){
        StringBuffer sb1=new StringBuffer();
        System.out.println("capacity of stringbuffer object sb1: "+sb1.capacity());
        StringBuffer sb2=new StringBuffer("Hello");
        System.out.println("capacity of stringbuffer object sb2: "+sb2.capacity());
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a String:");
        String inputString=scanner.nextLine();
        StringBuffer reversedBuffer=new StringBuffer(inputString);
        reversedBuffer.reverse();
        String reversedUpperCase=reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed string in uppercase:"+reversedUpperCase);
        System.out.println("Enter a string to append: ");
        String appendString=scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("strings after appending:"+reversedBuffer);

        scanner.close();
    }
}