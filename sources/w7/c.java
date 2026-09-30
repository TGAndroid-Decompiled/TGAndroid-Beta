package w7;
public final class c {
    public static final c f45006a;
    public static final c[] f45007b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f45006a = r02;
        f45007b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f45007b.clone();
    }
}
