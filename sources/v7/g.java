package v7;
public final class g {
    public static final g f44260a;
    public static final g[] f44261b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44260a = r02;
        f44261b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44261b.clone();
    }
}
