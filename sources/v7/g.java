package v7;
public final class g {
    public static final g f47449a;
    public static final g[] f47450b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47449a = r02;
        f47450b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f47450b.clone();
    }
}
