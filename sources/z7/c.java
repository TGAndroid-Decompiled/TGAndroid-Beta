package z7;
public final class c {
    public static final c f59632a;
    public static final c[] f59633b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59632a = r02;
        f59633b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f59633b.clone();
    }
}
