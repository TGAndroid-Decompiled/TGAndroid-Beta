package pi;
public final class m {
    public static final m f45798a;
    public static final m f45799b;
    public static final m[] f45800c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f45798a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f45799b = r12;
        f45800c = new m[]{r02, r12};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f45800c.clone();
    }
}
