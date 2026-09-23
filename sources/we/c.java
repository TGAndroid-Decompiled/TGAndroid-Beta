package we;
public final class c {
    public static final c f44970a;
    public static final c f44971b;
    public static final c f44972c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f44970a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f44971b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f44972c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
