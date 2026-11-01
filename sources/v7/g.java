package v7;
public final class g {
    public static final g f50460a;
    public static final g[] f50461b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50460a = r02;
        f50461b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f50461b.clone();
    }
}
