package v7;
public final class g {
    public static final g f43928a;
    public static final g[] f43929b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f43928a = r02;
        f43929b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f43929b.clone();
    }
}
