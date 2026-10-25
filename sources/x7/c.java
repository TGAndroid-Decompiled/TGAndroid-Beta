package x7;
public final class c {
    public static final c f51424a;
    public static final c[] f51425b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51424a = r02;
        f51425b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f51425b.clone();
    }
}
