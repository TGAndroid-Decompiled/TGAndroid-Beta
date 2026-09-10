package w7;
public final class c {
    public static final c f43575a;
    public static final c[] f43576b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f43575a = r02;
        f43576b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f43576b.clone();
    }
}
