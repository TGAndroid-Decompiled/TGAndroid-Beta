package vi;
public final class f {
    public static final f f57534a;
    public static final f f57535b;
    public static final f[] f57536c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f57534a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f57535b = r12;
        f57536c = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f57536c.clone();
    }
}
