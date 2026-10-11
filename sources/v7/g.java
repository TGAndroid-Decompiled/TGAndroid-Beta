package v7;
public final class g {
    public static final g f49314a;
    public static final g[] f49315b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49314a = r02;
        f49315b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f49315b.clone();
    }
}
