package z7;
public final class v {
    public static final v f54301a;
    public static final v[] f54302b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f54301a = r02;
        f54302b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f54302b.clone();
    }
}
