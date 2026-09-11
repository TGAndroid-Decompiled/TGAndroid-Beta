package w7;
public final class c {
    public static final c f48061a;
    public static final c[] f48062b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48061a = r02;
        f48062b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48062b.clone();
    }
}
