package qi;
public final class j {
    public static final j f43409a;
    public static final j f43410b;
    public static final j[] f43411c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f43409a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f43410b = r12;
        f43411c = new j[]{r02, r12};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f43411c.clone();
    }
}
