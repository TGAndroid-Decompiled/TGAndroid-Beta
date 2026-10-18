package si;
public final class l0 {
    public static final l0 f46747a;
    public static final l0 f46748b;
    public static final l0[] f46749c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f46747a = r02;
        ?? r12 = new Enum("BACK", 1);
        f46748b = r12;
        f46749c = new l0[]{r02, r12};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f46749c.clone();
    }
}
