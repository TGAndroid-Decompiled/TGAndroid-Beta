package we;
public final class c {
    public static final c f49045a;
    public static final c f49046b;
    public static final c f49047c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f49045a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f49046b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f49047c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
