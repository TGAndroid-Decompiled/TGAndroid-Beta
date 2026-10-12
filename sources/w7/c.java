package w7;
public final class c {
    public static final c f50138a;
    public static final c[] f50139b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50138a = r02;
        f50139b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f50139b.clone();
    }
}
