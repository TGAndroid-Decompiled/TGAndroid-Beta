package ye;
public final class c {
    public static final c f50136a;
    public static final c f50137b;
    public static final c f50138c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f50136a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f50137b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f50138c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
