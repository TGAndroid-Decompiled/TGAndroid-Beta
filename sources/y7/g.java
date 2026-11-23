package y7;
public final class g {
    public static final g f60860a;
    public static final g[] f60861b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f60860a = r02;
        f60861b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f60861b.clone();
    }
}
