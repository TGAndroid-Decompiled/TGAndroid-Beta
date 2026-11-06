package vi;
public final class f {
    public static final f f57441a;
    public static final f f57442b;
    public static final f[] f57443c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f57441a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f57442b = r12;
        f57443c = new f[]{r02, r12};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f57443c.clone();
    }
}
