package z7;
public final class v {
    public static final v f52958a;
    public static final v[] f52959b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f52958a = r02;
        f52959b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f52959b.clone();
    }
}
