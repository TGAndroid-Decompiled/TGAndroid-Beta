package v7;
public final class g {
    public static final g f47936a;
    public static final g[] f47937b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47936a = r02;
        f47937b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f47937b.clone();
    }
}
