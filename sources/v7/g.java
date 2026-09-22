package v7;
public final class g {
    public static final g f44298a;
    public static final g[] f44299b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44298a = r02;
        f44299b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44299b.clone();
    }
}
