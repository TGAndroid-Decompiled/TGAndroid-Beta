package sf;
public final class b {
    public static final b f48256a;
    public static final b f48257b;
    public static final b[] f48258c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f48256a = r02;
        ?? r12 = new Enum("TON", 1);
        f48257b = r12;
        f48258c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f48258c.clone();
    }
}
