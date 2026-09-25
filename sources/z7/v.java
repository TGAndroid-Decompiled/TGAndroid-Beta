package z7;
public final class v {
    public static final v f48904a;
    public static final v[] f48905b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48904a = r02;
        f48905b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48905b.clone();
    }
}
