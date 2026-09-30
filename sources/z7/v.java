package z7;
public final class v {
    public static final v f49011a;
    public static final v[] f49012b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49011a = r02;
        f49012b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f49012b.clone();
    }
}
