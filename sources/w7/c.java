package w7;
public final class c {
    public static final c f44899a;
    public static final c[] f44900b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44899a = r02;
        f44900b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44900b.clone();
    }
}
