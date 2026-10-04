package z7;
public final class v {
    public static final v f52931a;
    public static final v[] f52932b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f52931a = r02;
        f52932b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f52932b.clone();
    }
}
