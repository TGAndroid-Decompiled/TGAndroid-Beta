package xe;
public final class c {
    public static final c f51116a;
    public static final c f51117b;
    public static final c f51118c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f51116a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f51117b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f51118c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
