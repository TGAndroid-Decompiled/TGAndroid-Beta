package x9;
public final class c {
    public static final c f50464a;
    public static final c[] f50465b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50464a = r02;
        f50465b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f50465b.clone();
    }
}
