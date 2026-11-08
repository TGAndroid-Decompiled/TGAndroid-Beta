package wi;
public final class m0 {
    public static final m0 f58083a;
    public static final m0 f58084b;
    public static final m0[] f58085c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f58083a = r02;
        ?? r12 = new Enum("BACK", 1);
        f58084b = r12;
        f58085c = new m0[]{r02, r12};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f58085c.clone();
    }
}
