package z7;
public final class v {
    public static final v f51658a;
    public static final v[] f51659b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51658a = r02;
        f51659b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f51659b.clone();
    }
}
