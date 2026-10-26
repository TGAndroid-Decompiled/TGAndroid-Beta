package w7;
public final class g {
    public static final g f50855a;
    public static final g[] f50856b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50855a = r02;
        f50856b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f50856b.clone();
    }
}
