package z7;
public final class c {
    public static final c f59608a;
    public static final c[] f59609b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59608a = r02;
        f59609b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f59609b.clone();
    }
}
