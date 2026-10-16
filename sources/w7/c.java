package w7;
public final class c {
    public static final c f47218a;
    public static final c[] f47219b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47218a = r02;
        f47219b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f47219b.clone();
    }
}
