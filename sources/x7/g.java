package x7;
public final class g {
    public static final g f58296a;
    public static final g[] f58297b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f58296a = r02;
        f58297b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f58297b.clone();
    }
}
