package cpack;

import apack.A;

public class C {
    public void display() {
        A obj = new A();
        // System.out.println("Default: " + obj.defaultVar); // ❌ Not accessible
        // System.out.println("Protected: " + obj.protectedVar); // ❌ Not accessible (not inherited)
        // System.out.println("Private: " + obj.privateVar); // ❌ Not accessible
        System.out.println("Public: " + obj.publicVar); // ✅ Accessible
    }
}
