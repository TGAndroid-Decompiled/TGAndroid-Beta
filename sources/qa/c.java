package qa;
public final class c {
    public static final c f56113a;
    public static final c[] f56114b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f56113a = r02;
        f56114b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f56114b.clone();
    }
}
