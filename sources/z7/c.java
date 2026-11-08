package z7;
public final class c {
    public static final c f59732a;
    public static final c[] f59733b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59732a = r02;
        f59733b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f59733b.clone();
    }
}
