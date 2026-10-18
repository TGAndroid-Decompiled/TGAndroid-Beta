package v7;
public final class g {
    public static final g f48024a;
    public static final g[] f48025b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48024a = r02;
        f48025b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f48025b.clone();
    }
}
