package z7;
public final class v {
    public static final v f48625a;
    public static final v[] f48626b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48625a = r02;
        f48626b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48626b.clone();
    }
}
