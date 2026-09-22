package z7;
public final class v {
    public static final v f48952a;
    public static final v[] f48953b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48952a = r02;
        f48953b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48953b.clone();
    }
}
