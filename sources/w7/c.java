package w7;
public final class c {
    public static final c f44637a;
    public static final c[] f44638b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44637a = r02;
        f44638b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44638b.clone();
    }
}
