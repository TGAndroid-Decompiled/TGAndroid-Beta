package vi;
public final class f {
    public static final f f57442a;
    public static final f f57443b;
    public static final f[] f57444c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f57442a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f57443b = r12;
        f57444c = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f57444c.clone();
    }
}
