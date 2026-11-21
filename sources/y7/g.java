package y7;
public final class g {
    public static final g f60856a;
    public static final g[] f60857b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f60856a = r02;
        f60857b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f60857b.clone();
    }
}
