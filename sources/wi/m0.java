package wi;
public final class m0 {
    public static final m0 f58093a;
    public static final m0 f58094b;
    public static final m0[] f58095c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f58093a = r02;
        ?? r12 = new Enum("BACK", 1);
        f58094b = r12;
        f58095c = new m0[]{r02, r12};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f58095c.clone();
    }
}
