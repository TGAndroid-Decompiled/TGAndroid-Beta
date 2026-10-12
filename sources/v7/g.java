package v7;
public final class g {
    public static final g f46639a;
    public static final g[] f46640b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f46639a = r02;
        f46640b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f46640b.clone();
    }
}
