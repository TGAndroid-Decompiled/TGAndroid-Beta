package yi;
public final class g {
    public static final g f61439a;
    public static final g f61440b;
    public static final g[] f61441c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f61439a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f61440b = r12;
        f61441c = new g[]{r02, r12};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f61441c.clone();
    }
}
