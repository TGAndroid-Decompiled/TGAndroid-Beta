package vi;
public final class l0 {
    public static final l0 f50486a;
    public static final l0 f50487b;
    public static final l0[] f50488c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f50486a = r02;
        ?? r12 = new Enum("BACK", 1);
        f50487b = r12;
        f50488c = new l0[]{r02, r12};
    }

    public static l0 valueOf(String str) {
        return (l0) Enum.valueOf(l0.class, str);
    }

    public static l0[] values() {
        return (l0[]) f50488c.clone();
    }
}
