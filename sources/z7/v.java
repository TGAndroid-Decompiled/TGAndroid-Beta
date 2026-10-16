package z7;
public final class v {
    public static final v f49804a;
    public static final v[] f49805b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49804a = r02;
        f49805b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f49805b.clone();
    }
}
