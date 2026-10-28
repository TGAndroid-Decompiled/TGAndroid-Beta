package vi;
public final class n0 {
    public static final n0 f50557a;
    public static final n0 f50558b;
    public static final n0[] f50559c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f50557a = r02;
        ?? r12 = new Enum("BACK", 1);
        f50558b = r12;
        f50559c = new n0[]{r02, r12};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f50559c.clone();
    }
}
