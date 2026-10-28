package x7;
public final class c {
    public static final c f51485a;
    public static final c[] f51486b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51485a = r02;
        f51486b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f51486b.clone();
    }
}
