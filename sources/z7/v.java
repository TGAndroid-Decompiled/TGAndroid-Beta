package z7;
public final class v {
    public static final v f48947a;
    public static final v[] f48948b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48947a = r02;
        f48948b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48948b.clone();
    }
}
