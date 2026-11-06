package y7;
public final class g {
    public static final g f58932a;
    public static final g[] f58933b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f58932a = r02;
        f58933b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f58933b.clone();
    }
}
