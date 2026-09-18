package v7;
public final class g {
    public static final g f44232a;
    public static final g[] f44233b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44232a = r02;
        f44233b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44233b.clone();
    }
}
