package w7;
public final class c {
    public static final c f49909a;
    public static final c[] f49910b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49909a = r02;
        f49910b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f49910b.clone();
    }
}
