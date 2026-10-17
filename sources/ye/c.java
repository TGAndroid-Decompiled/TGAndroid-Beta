package ye;
public final class c {
    public static final c f50147a;
    public static final c f50148b;
    public static final c f50149c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f50147a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f50148b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f50149c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
