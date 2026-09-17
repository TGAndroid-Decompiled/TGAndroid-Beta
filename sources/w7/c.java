package w7;
public final class c {
    public static final c f48091a;
    public static final c[] f48092b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48091a = r02;
        f48092b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48092b.clone();
    }
}
