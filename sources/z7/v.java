package z7;
public final class v {
    public static final v f55125a;
    public static final v[] f55126b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f55125a = r02;
        f55126b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f55126b.clone();
    }
}
