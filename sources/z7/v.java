package z7;
public final class v {
    public static final v f48575a;
    public static final v[] f48576b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48575a = r02;
        f48576b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48576b.clone();
    }
}
