package xe;
public final class c {
    public static final c f51118a;
    public static final c f51119b;
    public static final c f51120c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f51118a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f51119b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f51120c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
