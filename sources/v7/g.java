package v7;
public final class g {
    public static final g f49237a;
    public static final g[] f49238b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49237a = r02;
        f49238b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f49238b.clone();
    }
}
