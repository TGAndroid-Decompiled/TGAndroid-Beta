package si;
public final class m0 {
    public static final m0 f46725a;
    public static final m0 f46726b;
    public static final m0 f46727c;
    public static final m0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f46725a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f46726b = r12;
        ?? r32 = new Enum("LOW", 2);
        f46727c = r32;
        d = new m0[]{r02, r12, r32};
    }

    public static m0 valueOf(String str) {
        return (m0) Enum.valueOf(m0.class, str);
    }

    public static m0[] values() {
        return (m0[]) d.clone();
    }
}
