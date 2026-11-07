package z7;
public final class c {
    public static final c f59638a;
    public static final c[] f59639b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59638a = r02;
        f59639b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f59639b.clone();
    }
}
