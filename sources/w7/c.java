package w7;
public final class c {
    public static final c f48062a;
    public static final c[] f48063b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48062a = r02;
        f48063b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48063b.clone();
    }
}
