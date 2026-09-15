package we;
public final class c {
    public static final c f45020a;
    public static final c f45021b;
    public static final c f45022c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f45020a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f45021b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f45022c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
