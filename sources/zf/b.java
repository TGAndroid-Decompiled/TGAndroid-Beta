package zf;
public final class b {
    public static final b f53296a;
    public static final b f53297b;
    public static final b[] f53298c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f53296a = r02;
        ?? r12 = new Enum("TON", 1);
        f53297b = r12;
        f53298c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f53298c.clone();
    }
}
