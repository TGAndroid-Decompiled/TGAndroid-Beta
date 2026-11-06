package vi;
public final class f {
    public static final f f57417a;
    public static final f f57418b;
    public static final f[] f57419c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f57417a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f57418b = r12;
        f57419c = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f57419c.clone();
    }
}
