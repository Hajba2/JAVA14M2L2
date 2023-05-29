public class Main {
    public static void main(String[] args) {

        String s = "Hello my name is Java";

        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        System.out.println("s.getBytes().length = " + s.getBytes().length);
        System.out.println("s.length() = " + s.length());

        System.out.println("s.substring(6, 8) = " + s.substring(6, 8));
        System.out.println("s.substring(9) = " + s.substring(9));

        System.out.println();

        System.out.println("s.contains(Java) = " + s.contains("Java"));
        System.out.println("s.contains(abraKadabra) = " + s.contains("abraKadabra"));

        System.out.println("s.startsWith(\"Hello\") = " + s.startsWith("Hello"));
        System.out.println("s.endsWith(\"Java\") = " + s.endsWith("va"));

        System.out.println("s.isEmpty() = " + s.isEmpty());
        System.out.println("\"\".isEmpty() = " + "".isEmpty());

        String[] split = "name1; name2; name3".split(";");

        String name = "name";
        System.out.println(name.substring(0,1).toUpperCase() + name.substring(1, name.length()-1) + name.substring(3, 4).toUpperCase());

        String g = "   sdjfb sdfsd sdf sd  s   ";
        System.out.println("g.trim() = " + g.trim());

        String a = "\n   ";
        String a1 = "   ";
        String a2 = "";
        System.out.println("a.isEmpty() = " + a.isEmpty());
        System.out.println("a1.isEmpty() = " + a1.isEmpty());
        System.out.println("a2.isEmpty() = " + a2.isEmpty());
        System.out.println("a.isBlank() = " + a.isBlank());

        System.out.println("Этот текст на русском эъ + Цей текст Українською їє");

        System.out.println("\"JaVa\".equalsIgnoreCase(\"java\") = " + "JaVa".equalsIgnoreCase("java"));
        System.out.println("\"JaVa\".equals(\"java\") = " + "JaVa".equals("java"));

        //fifth();
        //fourth();
        //third();
        //second();
    }

    public static void six() {
        String s1 = new String("my name is Vova");
        String s2 = new String("my name is Vova");

        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1 == s2 = " + s1 == s2);

        String poolStr1 = "Ivan";
        String poolStr2 = "Ivan";
        String poolStr3 = "Vasya";

        System.out.println("poolStr1.equals(poolStr2) = " + poolStr1.equals(poolStr2));
        System.out.println("poolStr1 == poolStr2 = " + (poolStr1 == poolStr2));

        System.out.println();

        System.out.println("poolStr2.equals(poolStr3) = " + poolStr2.equals(poolStr3));
        System.out.println("poolStr2 == poolStr3 = " + (poolStr2 == poolStr3));
    }

    public static void fifth() {
        boolean a = true;
        boolean b = true;

        boolean a1 = false;
        boolean b1 = true;

        boolean a2 = true;
        boolean b2 = false;

        boolean a3 = false;
        boolean b3 = false;

        System.out.println(a + " ^ " + b + "= " + (a ^ b));
        System.out.println(a1 + " ^ " + b1 + "= " + (a1 ^ b1));
        System.out.println(a2 + " ^ " + b2 + "= " + (a2 ^ b2));
        System.out.println(a3 + " ^ " + b3 + "= " + (a3 ^ b3));

        System.out.println();
        System.out.println();

        System.out.println(a + " !^ " + b + "= " + !(a ^ b));
        System.out.println(a1 + " !^ " + b1 + "= " + !(a1 ^ b1));
        System.out.println(a2 + " !^ " + b2 + "= " + !(a2 ^ b2));
        System.out.println(a3 + " !^ " + b3 + "= " + !(a3 ^ b3));

        System.out.println();
        System.out.println();

        System.out.println(a + " == " + b + "= " + (a == b));
        System.out.println(a1 + " == " + b1 + "= " + (a1 == b1));
        System.out.println(a2 + " == " + b2 + "= " + (a2 == b2));
        System.out.println(a3 + " == " + b3 + "= " + (a3 == b3));

        System.out.println(a != b);


        int i1 = 8;
        int i2 = 9;
        boolean iBool = i1 != i2;
        System.out.println(iBool);
    }

    public static void fourth() {

        boolean res = getSecondBool() && getFirstBool();

        //res - піти шуляти пішки
        System.out.println("res = " + res);
    }

    public static void third() {

        boolean res = getFirstBool() || getSecondBool();

        //res - піти шуляти пішки
        System.out.println("res = " + res);
    }

    //дані з прогнозів
    public static boolean getFirstBool() {
        // some difficult logic to get res
        return true;
    }

    //дані з датчиків
    public static boolean getSecondBool() {
        // some difficult logic to get res
        return false;
    }

    public static void second() {
        boolean a = true;
        boolean b = true;

        boolean res = a | b;

        System.out.println("boolean res = " + a + " | " + b);
        System.out.println("res = " + res);
    }

    public static void first() {
        boolean a = true;
        boolean b = false;

        boolean res = a & b;

        System.out.println("boolean res = " + a + " & " + b);
        System.out.println("res = " + res);
    }
}