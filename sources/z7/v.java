package z7;
public final class v {
    public static final v f51198a;
    public static final v[] f51199b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51198a = r02;
        f51199b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f51199b.clone();
    }
}
