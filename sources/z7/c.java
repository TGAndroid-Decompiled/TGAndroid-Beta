package z7;
public final class c {
    public static final c f59731a;
    public static final c[] f59732b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59731a = r02;
        f59732b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f59732b.clone();
    }
}
