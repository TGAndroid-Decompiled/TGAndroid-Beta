package y7;
public final class g {
    public static final g f59028a;
    public static final g[] f59029b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59028a = r02;
        f59029b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f59029b.clone();
    }
}
