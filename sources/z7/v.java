package z7;
public final class v {
    public static final v f48632a;
    public static final v[] f48633b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48632a = r02;
        f48633b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48633b.clone();
    }
}
