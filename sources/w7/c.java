package w7;
public final class c {
    public static final c f48619a;
    public static final c[] f48620b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48619a = r02;
        f48620b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48620b.clone();
    }
}
