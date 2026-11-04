package y7;
public final class c {
    public static final c f59056a;
    public static final c[] f59057b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59056a = r02;
        f59057b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f59057b.clone();
    }
}
