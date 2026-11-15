package y7;
public final class g {
    public static final g f60249a;
    public static final g[] f60250b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f60249a = r02;
        f60250b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f60250b.clone();
    }
}
