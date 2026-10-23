package si;
public final class m0 {
    public static final m0 f47168a;
    public static final m0 f47169b;
    public static final m0[] f47170c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f47168a = r02;
        ?? r12 = new Enum("BACK", 1);
        f47169b = r12;
        f47170c = new m0[]{r02, r12};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f47170c.clone();
    }
}
