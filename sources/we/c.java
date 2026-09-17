package we;
public final class c {
    public static final c f48491a;
    public static final c f48492b;
    public static final c f48493c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f48491a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f48492b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f48493c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
