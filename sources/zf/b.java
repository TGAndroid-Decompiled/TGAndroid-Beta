package zf;
public final class b {
    public static final b f51624a;
    public static final b f51625b;
    public static final b[] f51626c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f51624a = r02;
        ?? r12 = new Enum("TON", 1);
        f51625b = r12;
        f51626c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f51626c.clone();
    }
}
