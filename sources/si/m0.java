package si;
public final class m0 {
    public static final m0 f46732a;
    public static final m0 f46733b;
    public static final m0 f46734c;
    public static final m0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f46732a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f46733b = r12;
        ?? r32 = new Enum("LOW", 2);
        f46734c = r32;
        d = new m0[]{r02, r12, r32};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) d.clone();
    }
}
