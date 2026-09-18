package v7;
public final class g {
    public static final g f44006a;
    public static final g[] f44007b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44006a = r02;
        f44007b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44007b.clone();
    }
}
