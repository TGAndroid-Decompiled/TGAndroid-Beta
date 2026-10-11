package xe;
public final class c {
    public static final c f51205a;
    public static final c f51206b;
    public static final c f51207c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f51205a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f51206b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f51207c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
