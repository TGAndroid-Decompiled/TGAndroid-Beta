package z7;
public final class v {
    public static final v f51291a;
    public static final v[] f51292b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51291a = r02;
        f51292b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f51292b.clone();
    }
}
