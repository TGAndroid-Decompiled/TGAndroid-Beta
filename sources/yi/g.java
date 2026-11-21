package yi;
public final class g {
    public static final g f61351a;
    public static final g f61352b;
    public static final g[] f61353c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f61351a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f61352b = r12;
        f61353c = new g[]{r02, r12};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f61353c.clone();
    }
}
