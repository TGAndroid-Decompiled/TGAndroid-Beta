package yi;
public final class g {
    public static final g f61310a;
    public static final g f61311b;
    public static final g[] f61312c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f61310a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f61311b = r12;
        f61312c = new g[]{r02, r12};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f61312c.clone();
    }
}
