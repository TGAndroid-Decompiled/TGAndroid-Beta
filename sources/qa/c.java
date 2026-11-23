package qa;
public final class c {
    public static final c f56082a;
    public static final c[] f56083b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f56082a = r02;
        f56083b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f56083b.clone();
    }
}
