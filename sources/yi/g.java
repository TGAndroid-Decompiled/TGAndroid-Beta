package yi;
public final class g {
    public static final g f61355a;
    public static final g f61356b;
    public static final g[] f61357c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f61355a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f61356b = r12;
        f61357c = new g[]{r02, r12};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f61357c.clone();
    }
}
