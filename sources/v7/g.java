package v7;
public final class g {
    public static final g f47477a;
    public static final g[] f47478b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47477a = r02;
        f47478b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f47478b.clone();
    }
}
