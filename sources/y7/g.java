package y7;
public final class g {
    public static final g f59027a;
    public static final g[] f59028b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59027a = r02;
        f59028b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f59028b.clone();
    }
}
