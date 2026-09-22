package w7;
public final class c {
    public static final c f44610a;
    public static final c[] f44611b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44610a = r02;
        f44611b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44611b.clone();
    }
}
