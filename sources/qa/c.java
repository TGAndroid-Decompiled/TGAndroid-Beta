package qa;
public final class c {
    public static final c f55498a;
    public static final c[] f55499b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f55498a = r02;
        f55499b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f55499b.clone();
    }
}
