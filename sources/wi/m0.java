package wi;
public final class m0 {
    public static final m0 f57990a;
    public static final m0 f57991b;
    public static final m0[] f57992c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f57990a = r02;
        ?? r12 = new Enum("BACK", 1);
        f57991b = r12;
        f57992c = new m0[]{r02, r12};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f57992c.clone();
    }
}
