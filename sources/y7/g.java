package y7;
public final class g {
    public static final g f60825a;
    public static final g[] f60826b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f60825a = r02;
        f60826b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f60826b.clone();
    }
}
