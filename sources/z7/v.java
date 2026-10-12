package z7;
public final class v {
    public static final v f54293a;
    public static final v[] f54294b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f54293a = r02;
        f54294b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f54294b.clone();
    }
}
