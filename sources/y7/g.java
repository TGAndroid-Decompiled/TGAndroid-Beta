package y7;
public final class g {
    public static final g f58933a;
    public static final g[] f58934b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f58933a = r02;
        f58934b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f58934b.clone();
    }
}
