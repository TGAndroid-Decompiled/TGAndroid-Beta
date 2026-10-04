package v7;
public final class g {
    public static final g f47928a;
    public static final g[] f47929b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47928a = r02;
        f47929b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f47929b.clone();
    }
}
