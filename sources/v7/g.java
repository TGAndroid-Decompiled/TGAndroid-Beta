package v7;
public final class g {
    public static final g f44259a;
    public static final g[] f44260b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44259a = r02;
        f44260b = new g[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static g[] values() {
        return (g[]) f44260b.clone();
    }
}
