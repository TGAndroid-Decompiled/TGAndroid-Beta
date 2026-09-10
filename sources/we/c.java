package we;
public final class c {
    public static final c f43976a;
    public static final c f43977b;
    public static final c f43978c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f43976a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f43977b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f43978c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
