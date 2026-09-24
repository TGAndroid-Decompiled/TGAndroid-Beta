package v7;
public final class g {
    public static final g f44246a;
    public static final g[] f44247b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44246a = r02;
        f44247b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44247b.clone();
    }
}
