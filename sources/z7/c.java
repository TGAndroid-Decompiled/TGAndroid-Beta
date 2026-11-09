package z7;
public final class c {
    public static final c f59741a;
    public static final c[] f59742b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59741a = r02;
        f59742b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f59742b.clone();
    }
}
