package w7;
public final class c {
    public static final c f47219a;
    public static final c[] f47220b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f47219a = r02;
        f47220b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f47220b.clone();
    }
}
