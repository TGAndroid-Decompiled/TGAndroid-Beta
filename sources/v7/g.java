package v7;
public final class g {
    public static final g f49429a;
    public static final g[] f49430b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49429a = r02;
        f49430b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f49430b.clone();
    }
}
