package v7;
public final class g {
    public static final g f50446a;
    public static final g[] f50447b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50446a = r02;
        f50447b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f50447b.clone();
    }
}
