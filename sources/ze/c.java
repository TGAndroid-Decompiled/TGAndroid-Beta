package ze;
public final class c {
    public static final c f52911a;
    public static final c f52912b;
    public static final c f52913c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f52911a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f52912b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f52913c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
