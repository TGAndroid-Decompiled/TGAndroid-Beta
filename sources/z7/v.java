package z7;
public final class v {
    public static final v f48932a;
    public static final v[] f48933b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48932a = r02;
        f48933b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48933b.clone();
    }
}
