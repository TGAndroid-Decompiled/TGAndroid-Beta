package zf;
public final class b {
    public static final b f54443a;
    public static final b f54444b;
    public static final b[] f54445c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f54443a = r02;
        ?? r12 = new Enum("TON", 1);
        f54444b = r12;
        f54445c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54445c.clone();
    }
}
