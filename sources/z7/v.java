package z7;
public final class v {
    public static final v f51190a;
    public static final v[] f51191b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51190a = r02;
        f51191b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f51191b.clone();
    }
}
