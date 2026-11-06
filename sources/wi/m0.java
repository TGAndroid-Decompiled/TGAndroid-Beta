package wi;
public final class m0 {
    public static final m0 f58015a;
    public static final m0 f58016b;
    public static final m0[] f58017c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f58015a = r02;
        ?? r12 = new Enum("BACK", 1);
        f58016b = r12;
        f58017c = new m0[]{r02, r12};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) f58017c.clone();
    }
}
