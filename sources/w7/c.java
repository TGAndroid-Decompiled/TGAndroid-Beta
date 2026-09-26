package w7;
public final class c {
    public static final c f44897a;
    public static final c[] f44898b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44897a = r02;
        f44898b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44898b.clone();
    }
}
