package v7;
public final class g {
    public static final g f44306a;
    public static final g[] f44307b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44306a = r02;
        f44307b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44307b.clone();
    }
}
