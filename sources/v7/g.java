package v7;
public final class g {
    public static final g f48473a;
    public static final g[] f48474b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48473a = r02;
        f48474b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f48474b.clone();
    }
}
