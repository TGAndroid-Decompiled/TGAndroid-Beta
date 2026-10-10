package z7;
public final class v {
    public static final v f54108a;
    public static final v[] f54109b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f54108a = r02;
        f54109b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f54109b.clone();
    }
}
