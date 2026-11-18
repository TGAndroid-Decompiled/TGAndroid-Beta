package yi;
public final class g {
    public static final g f61309a;
    public static final g f61310b;
    public static final g[] f61311c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f61309a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f61310b = r12;
        f61311c = new g[]{r02, r12};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f61311c.clone();
    }
}
