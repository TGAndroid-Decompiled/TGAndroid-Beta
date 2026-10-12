package v7;
public final class g {
    public static final g f49421a;
    public static final g[] f49422b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49421a = r02;
        f49422b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f49422b.clone();
    }
}
