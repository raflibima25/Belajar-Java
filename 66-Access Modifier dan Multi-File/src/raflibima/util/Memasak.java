package raflibima.util;

public class Memasak {

    public static void dagingPublic() {
        System.out.println("Raflibima: Memasak: public");
    }

    private static void dagingPrivate() {
        System.out.println("Raflibima: Memasak: private");
    }

    static void dagingDefault() {
        System.out.println("Raflibima: Memasak: default");
    }
    protected static void dagingProtected() {
        System.out.println("Raflibima: Memasak: protected");
    }

}
