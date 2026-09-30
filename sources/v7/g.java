package v7;
public final class g {
    public static final g f44368a;
    public static final g[] f44369b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44368a = r02;
        f44369b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44369b.clone();
    }
}
