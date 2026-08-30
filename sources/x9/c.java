package x9;
public final class c {
    public static final c f46857a;
    public static final c[] f46858b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f46857a = r02;
        f46858b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f46858b.clone();
    }
}
