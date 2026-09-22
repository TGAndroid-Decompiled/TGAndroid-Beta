package w7;
public final class c {
    public static final c f44935a;
    public static final c[] f44936b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44935a = r02;
        f44936b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44936b.clone();
    }
}
