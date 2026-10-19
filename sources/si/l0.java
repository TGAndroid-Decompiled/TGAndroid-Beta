package si;
public final class l0 {
    public static final l0 f46702a;
    public static final l0 f46703b;
    public static final l0[] f46704c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f46702a = r02;
        ?? r12 = new Enum("BACK", 1);
        f46703b = r12;
        f46704c = new l0[]{r02, r12};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f46704c.clone();
    }
}
