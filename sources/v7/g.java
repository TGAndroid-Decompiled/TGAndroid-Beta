package v7;
public final class g {
    public static final g f48035a;
    public static final g[] f48036b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48035a = r02;
        f48036b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f48036b.clone();
    }
}
