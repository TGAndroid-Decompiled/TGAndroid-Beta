package w7;
public final class c {
    public static final c f50032a;
    public static final c[] f50033b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50032a = r02;
        f50033b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f50033b.clone();
    }
}
