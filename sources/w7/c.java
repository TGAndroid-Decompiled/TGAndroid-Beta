package w7;
public final class c {
    public static final c f48614a;
    public static final c[] f48615b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48614a = r02;
        f48615b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48615b.clone();
    }
}
