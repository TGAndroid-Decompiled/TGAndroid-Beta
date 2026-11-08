package qa;
public final class c {
    public static final c f54050a;
    public static final c[] f54051b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f54050a = r02;
        f54051b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f54051b.clone();
    }
}
