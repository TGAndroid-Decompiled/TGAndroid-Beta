package z7;
public final class v {
    public static final v f52932a;
    public static final v[] f52933b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f52932a = r02;
        f52933b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f52933b.clone();
    }
}
