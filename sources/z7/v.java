package z7;
public final class v {
    public static final v f51290a;
    public static final v[] f51291b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51290a = r02;
        f51291b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f51291b.clone();
    }
}
