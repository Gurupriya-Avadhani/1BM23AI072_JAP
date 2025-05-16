package dpack;

import bpack.B;
import cpack.C;

public class ProtectedDemo {
    public static void main(String[] args) {
        B bObj = new B();
        C cObj = new C();

        System.out.println("Class B Display:");
        bObj.display();

        System.out.println("\nClass C Display:");
        cObj.display();
    }
}
