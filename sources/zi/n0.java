package zi;
public final class n0 {
    public static final n0 f62273a;
    public static final n0 f62274b;
    public static final n0[] f62275c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f62273a = r02;
        ?? r12 = new Enum("BACK", 1);
        f62274b = r12;
        f62275c = new n0[]{r02, r12};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f62275c.clone();
    }
}
