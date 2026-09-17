package v7;
public final class g {
    public static final g f47478a;
    public static final g[] f47479b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47478a = r02;
        f47479b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f47479b.clone();
    }
}
