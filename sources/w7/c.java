package w7;
public final class c {
    public static final c f48625a;
    public static final c[] f48626b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48625a = r02;
        f48626b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48626b.clone();
    }
}
