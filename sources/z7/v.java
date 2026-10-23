package z7;
public final class v {
    public static final v f51199a;
    public static final v[] f51200b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51199a = r02;
        f51200b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f51200b.clone();
    }
}
