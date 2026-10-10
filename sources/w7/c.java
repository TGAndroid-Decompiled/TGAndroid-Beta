package w7;
public final class c {
    public static final c f49955a;
    public static final c[] f49956b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49955a = r02;
        f49956b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f49956b.clone();
    }
}
