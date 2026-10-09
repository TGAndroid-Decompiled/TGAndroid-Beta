package z7;
public final class v {
    public static final v f54064a;
    public static final v[] f54065b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f54064a = r02;
        f54065b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f54065b.clone();
    }
}
