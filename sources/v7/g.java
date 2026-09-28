package v7;
public final class g {
    public static final g f44261a;
    public static final g[] f44262b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44261a = r02;
        f44262b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44262b.clone();
    }
}
