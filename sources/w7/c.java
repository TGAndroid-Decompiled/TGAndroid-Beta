package w7;
public final class c {
    public static final c f48650a;
    public static final c[] f48651b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48650a = r02;
        f48651b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48651b.clone();
    }
}
