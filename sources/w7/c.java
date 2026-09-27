package w7;
public final class c {
    public static final c f44943a;
    public static final c[] f44944b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44943a = r02;
        f44944b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44944b.clone();
    }
}
