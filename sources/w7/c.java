package w7;
public final class c {
    public static final c f48090a;
    public static final c[] f48091b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48090a = r02;
        f48091b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48091b.clone();
    }
}
