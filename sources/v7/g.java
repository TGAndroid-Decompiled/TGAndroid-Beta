package v7;
public final class g {
    public static final g f48026a;
    public static final g[] f48027b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48026a = r02;
        f48027b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f48027b.clone();
    }
}
