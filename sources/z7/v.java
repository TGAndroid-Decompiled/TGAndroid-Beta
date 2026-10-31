package z7;
public final class v {
    public static final v f55107a;
    public static final v[] f55108b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f55107a = r02;
        f55108b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f55108b.clone();
    }
}
