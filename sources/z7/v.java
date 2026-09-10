package z7;
public final class v {
    public static final v f47748a;
    public static final v[] f47749b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47748a = r02;
        f47749b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f47749b.clone();
    }
}
