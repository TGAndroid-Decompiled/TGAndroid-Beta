package x9;
public final class c {
    public static final c f50465a;
    public static final c[] f50466b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50465a = r02;
        f50466b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f50466b.clone();
    }
}
