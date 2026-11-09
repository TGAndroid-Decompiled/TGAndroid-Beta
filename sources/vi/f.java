package vi;
public final class f {
    public static final f f57546a;
    public static final f f57547b;
    public static final f[] f57548c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f57546a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f57547b = r12;
        f57548c = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f57548c.clone();
    }
}
