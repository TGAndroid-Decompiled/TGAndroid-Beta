package yi;
public final class g {
    public static final g f61320a;
    public static final g f61321b;
    public static final g[] f61322c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f61320a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f61321b = r12;
        f61322c = new g[]{r02, r12};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f61322c.clone();
    }
}
