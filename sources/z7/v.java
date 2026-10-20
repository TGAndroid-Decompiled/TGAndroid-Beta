package z7;
public final class v {
    public static final v f51195a;
    public static final v[] f51196b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51195a = r02;
        f51196b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f51196b.clone();
    }
}
