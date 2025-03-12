package Gurupriya_Avadhani;

public class program_2a {
    public static void main(String[] args) {
        // Boxing for all primitive types
        int primitiveInt = 10;
        Integer boxedInt = primitiveInt;
        System.out.println("Boxed Integer: " + boxedInt);

        char primitiveChar = 'A';
        Character boxedChar = primitiveChar;
        System.out.println("Boxed Character: " + boxedChar);

        double primitiveDouble = 20.5;
        Double boxedDouble = primitiveDouble;
        System.out.println("Boxed Double: " + boxedDouble);

        boolean primitiveBoolean = true;
        Boolean boxedBoolean = primitiveBoolean;
        System.out.println("Boxed Boolean: " + boxedBoolean);

        float primitiveFloat = 30.5f;
        Float boxedFloat = primitiveFloat;
        System.out.println("Boxed Float: " + boxedFloat);

        byte primitiveByte = 100;
        Byte boxedByte = primitiveByte;
        System.out.println("Boxed Byte: " + boxedByte);

        short primitiveShort = 50;
        Short boxedShort = primitiveShort;
        System.out.println("Boxed Short: " + boxedShort);

        long primitiveLong = 100000L;
        Long boxedLong = primitiveLong;
        System.out.println("Boxed Long: " + boxedLong);

        // Unboxing for all wrapper objects
        Integer unboxedInt = boxedInt;
        System.out.println("Unboxed Integer: " + unboxedInt);

        Character unboxedChar = boxedChar;
        System.out.println("Unboxed Character: " + unboxedChar);

        Double unboxedDouble = boxedDouble;
        System.out.println("Unboxed Double: " + unboxedDouble);

        Boolean unboxedBoolean = boxedBoolean;
        System.out.println("Unboxed Boolean: " + unboxedBoolean);

        Float unboxedFloat = boxedFloat;
        System.out.println("Unboxed Float: " + unboxedFloat);

        Byte unboxedByte = boxedByte;
        System.out.println("Unboxed Byte: " + unboxedByte);

        Short unboxedShort = boxedShort;
        System.out.println("Unboxed Short: " + unboxedShort);

        Long unboxedLong = boxedLong;
        System.out.println("Unboxed Long: " + unboxedLong);
    }
}
