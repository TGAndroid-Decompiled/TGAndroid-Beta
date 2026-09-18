package w7;
public final class c {
    public static final c f44871a;
    public static final c[] f44872b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44871a = r02;
        f44872b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44872b.clone();
    }
}
