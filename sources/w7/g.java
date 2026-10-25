package w7;
public final class g {
    public static final g f50852a;
    public static final g[] f50853b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50852a = r02;
        f50853b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f50853b.clone();
    }
}
