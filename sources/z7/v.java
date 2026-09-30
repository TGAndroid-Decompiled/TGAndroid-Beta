package z7;
public final class v {
    public static final v f48905a;
    public static final v[] f48906b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48905a = r02;
        f48906b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48906b.clone();
    }
}
