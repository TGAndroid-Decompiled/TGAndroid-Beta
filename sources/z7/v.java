package z7;
public final class v {
    public static final v f48660a;
    public static final v[] f48661b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48660a = r02;
        f48661b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48661b.clone();
    }
}
