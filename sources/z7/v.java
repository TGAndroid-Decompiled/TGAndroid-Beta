package z7;
public final class v {
    public static final v f48892a;
    public static final v[] f48893b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48892a = r02;
        f48893b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48893b.clone();
    }
}
