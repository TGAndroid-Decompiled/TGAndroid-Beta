package t9;
public final class c {
    public static final c f47735a;
    public static final c[] f47736b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47735a = r02;
        f47736b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f47736b.clone();
    }
}
