package si;
public final class m0 {
    public static final m0 f46731a;
    public static final m0 f46732b;
    public static final m0[] f46733c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f46731a = r02;
        ?? r12 = new Enum("BACK", 1);
        f46732b = r12;
        f46733c = new m0[]{r02, r12};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f46733c.clone();
    }
}
