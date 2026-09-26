package z7;
public final class v {
    public static final v f48902a;
    public static final v[] f48903b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48902a = r02;
        f48903b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48903b.clone();
    }
}
