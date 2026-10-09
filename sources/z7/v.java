package z7;
public final class v {
    public static final v f54062a;
    public static final v[] f54063b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f54062a = r02;
        f54063b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f54063b.clone();
    }
}
