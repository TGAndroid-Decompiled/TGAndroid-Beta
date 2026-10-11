package z7;
public final class v {
    public static final v f54190a;
    public static final v[] f54191b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f54190a = r02;
        f54191b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f54191b.clone();
    }
}
