package zf;
public final class b {
    public static final b f53297a;
    public static final b f53298b;
    public static final b[] f53299c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f53297a = r02;
        ?? r12 = new Enum("TON", 1);
        f53298b = r12;
        f53299c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f53299c.clone();
    }
}
