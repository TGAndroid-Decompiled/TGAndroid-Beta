package v7;
public final class g {
    public static final g f49193a;
    public static final g[] f49194b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49193a = r02;
        f49194b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f49194b.clone();
    }
}
