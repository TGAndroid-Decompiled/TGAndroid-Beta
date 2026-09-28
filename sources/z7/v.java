package z7;
public final class v {
    public static final v f48903a;
    public static final v[] f48904b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48903a = r02;
        f48904b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48904b.clone();
    }
}
