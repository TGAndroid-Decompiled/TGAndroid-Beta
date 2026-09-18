package z7;
public final class v {
    public static final v f48886a;
    public static final v[] f48887b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48886a = r02;
        f48887b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48887b.clone();
    }
}
