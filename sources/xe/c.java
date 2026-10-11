package xe;
public final class c {
    public static final c f51239a;
    public static final c f51240b;
    public static final c f51241c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f51239a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f51240b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f51241c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
