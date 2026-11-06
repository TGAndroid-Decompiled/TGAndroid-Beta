package qa;
public final class c {
    public static final c f53932a;
    public static final c[] f53933b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f53932a = r02;
        f53933b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f53933b.clone();
    }
}
