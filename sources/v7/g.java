package v7;
public final class g {
    public static final g f44001a;
    public static final g[] f44002b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44001a = r02;
        f44002b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44002b.clone();
    }
}
