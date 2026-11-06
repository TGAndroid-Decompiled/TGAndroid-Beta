package y7;
public final class g {
    public static final g f58908a;
    public static final g[] f58909b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f58908a = r02;
        f58909b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f58909b.clone();
    }
}
