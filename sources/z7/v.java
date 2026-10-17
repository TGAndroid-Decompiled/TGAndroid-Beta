package z7;
public final class v {
    public static final v f51208a;
    public static final v[] f51209b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51208a = r02;
        f51209b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f51209b.clone();
    }
}
