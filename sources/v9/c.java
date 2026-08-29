package v9;
public final class c {
    public static final c f49465a;
    public static final c[] f49466b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49465a = r02;
        f49466b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f49466b.clone();
    }
}
