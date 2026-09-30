package v7;
public final class g {
    public static final g f44262a;
    public static final g[] f44263b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44262a = r02;
        f44263b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44263b.clone();
    }
}
