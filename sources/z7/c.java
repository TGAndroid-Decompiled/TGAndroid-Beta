package z7;
public final class c {
    public static final c f59633a;
    public static final c[] f59634b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59633a = r02;
        f59634b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f59634b.clone();
    }
}
