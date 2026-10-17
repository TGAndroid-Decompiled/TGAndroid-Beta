package v7;
public final class g {
    public static final g f48046a;
    public static final g[] f48047b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48046a = r02;
        f48047b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f48047b.clone();
    }
}
