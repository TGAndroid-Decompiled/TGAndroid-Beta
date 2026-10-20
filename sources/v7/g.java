package v7;
public final class g {
    public static final g f48031a;
    public static final g[] f48032b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48031a = r02;
        f48032b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f48032b.clone();
    }
}
