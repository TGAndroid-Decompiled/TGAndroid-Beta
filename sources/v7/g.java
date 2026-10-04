package v7;
public final class g {
    public static final g f47927a;
    public static final g[] f47928b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47927a = r02;
        f47928b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f47928b.clone();
    }
}
