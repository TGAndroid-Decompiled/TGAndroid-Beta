package v7;
public final class g {
    public static final g f43974a;
    public static final g[] f43975b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f43974a = r02;
        f43975b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f43975b.clone();
    }
}
