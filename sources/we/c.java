package we;
public final class c {
    public static final c f45315a;
    public static final c f45316b;
    public static final c f45317c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f45315a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f45316b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f45317c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
