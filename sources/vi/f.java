package vi;
public final class f {
    public static final f f57533a;
    public static final f f57534b;
    public static final f[] f57535c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f57533a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f57534b = r12;
        f57535c = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f57535c.clone();
    }
}
