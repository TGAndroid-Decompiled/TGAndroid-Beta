package w7;
public final class c {
    public static final c f44564a;
    public static final c[] f44565b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44564a = r02;
        f44565b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44565b.clone();
    }
}
