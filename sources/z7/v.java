package z7;
public final class v {
    public static final v f48655a;
    public static final v[] f48656b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48655a = r02;
        f48656b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f48656b.clone();
    }
}
