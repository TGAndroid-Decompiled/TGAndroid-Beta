package w7;
public final class g {
    public static final g f50913a;
    public static final g[] f50914b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50913a = r02;
        f50914b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f50914b.clone();
    }
}
