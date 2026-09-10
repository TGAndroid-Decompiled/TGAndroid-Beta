package v7;
public final class g {
    public static final g f43000a;
    public static final g[] f43001b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f43000a = r02;
        f43001b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f43001b.clone();
    }
}
