package w7;
public final class c {
    public static final c f44884a;
    public static final c[] f44885b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44884a = r02;
        f44885b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44885b.clone();
    }
}
