package qa;
public final class c {
    public static final c f53956a;
    public static final c[] f53957b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f53956a = r02;
        f53957b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f53957b.clone();
    }
}
