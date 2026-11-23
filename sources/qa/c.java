package qa;
public final class c {
    public static final c f56195a;
    public static final c[] f56196b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f56195a = r02;
        f56196b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f56196b.clone();
    }
}
