package z7;
public final class c {
    public static final c f60939a;
    public static final c[] f60940b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f60939a = r02;
        f60940b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f60940b.clone();
    }
}
