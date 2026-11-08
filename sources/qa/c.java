package qa;
public final class c {
    public static final c f54049a;
    public static final c[] f54050b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f54049a = r02;
        f54050b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f54050b.clone();
    }
}
