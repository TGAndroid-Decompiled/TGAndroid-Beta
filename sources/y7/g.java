package y7;
public final class g {
    public static final g f60815a;
    public static final g[] f60816b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f60815a = r02;
        f60816b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f60816b.clone();
    }
}
