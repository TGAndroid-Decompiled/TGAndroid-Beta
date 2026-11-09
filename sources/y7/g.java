package y7;
public final class g {
    public static final g f59037a;
    public static final g[] f59038b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59037a = r02;
        f59038b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f59038b.clone();
    }
}
