package vi;
public final class f {
    public static final f f57545a;
    public static final f f57546b;
    public static final f[] f57547c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f57545a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f57546b = r12;
        f57547c = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f57547c.clone();
    }
}
