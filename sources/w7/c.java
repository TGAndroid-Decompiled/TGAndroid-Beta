package w7;
public final class c {
    public static final c f44614a;
    public static final c[] f44615b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44614a = r02;
        f44615b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44615b.clone();
    }
}
