package we;
public final class c {
    public static final c f45048a;
    public static final c f45049b;
    public static final c f45050c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f45048a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f45049b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f45050c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
