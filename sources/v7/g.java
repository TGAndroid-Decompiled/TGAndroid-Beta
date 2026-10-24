package v7;
public final class g {
    public static final g f48472a;
    public static final g[] f48473b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48472a = r02;
        f48473b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f48473b.clone();
    }
}
