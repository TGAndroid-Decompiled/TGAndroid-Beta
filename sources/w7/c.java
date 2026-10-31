package w7;
public final class c {
    public static final c f52477a;
    public static final c[] f52478b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f52477a = r02;
        f52478b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f52478b.clone();
    }
}
