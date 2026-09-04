package z7;
public final class v {
    public static final v f51259a;
    public static final v[] f51260b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51259a = r02;
        f51260b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f51260b.clone();
    }
}
