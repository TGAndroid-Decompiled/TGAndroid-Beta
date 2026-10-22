package ye;
public final class c {
    public static final c f50135a;
    public static final c f50136b;
    public static final c f50137c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f50135a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f50136b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f50137c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
