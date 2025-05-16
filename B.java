package bpack;

import apack.A;

public class B extends A {
    public void display() {
        // System.out.println("Default: " + defaultVar); // ❌ Not accessible: defaultVar not visible in another package
        System.out.println("Protected: " + protectedVar); // ✅ Accessible via inheritance
        // System.out.println("Private: " + privateVar); // ❌ Not accessible
        System.out.println("Public: " + publicVar); // ✅ Accessible
    }
}
