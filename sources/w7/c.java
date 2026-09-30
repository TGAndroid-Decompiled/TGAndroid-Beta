package w7;
public final class c {
    public static final c f44900a;
    public static final c[] f44901b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44900a = r02;
        f44901b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44901b.clone();
    }
}
