package v7;
public final class g {
    public static final g f49280a;
    public static final g[] f49281b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49280a = r02;
        f49281b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f49281b.clone();
    }
}
