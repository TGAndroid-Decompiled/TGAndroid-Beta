package z7;
public final class v {
    public static final v f49802a;
    public static final v[] f49803b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49802a = r02;
        f49803b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f49803b.clone();
    }
}
