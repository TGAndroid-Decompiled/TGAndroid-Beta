package we;
public final class c {
    public static final c f49052a;
    public static final c f49053b;
    public static final c f49054c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f49052a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f49053b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f49054c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
