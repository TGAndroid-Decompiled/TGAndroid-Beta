package y7;
public final class g {
    public static final g f60940a;
    public static final g[] f60941b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f60940a = r02;
        f60941b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f60941b.clone();
    }
}
