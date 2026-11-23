package z7;
public final class c {
    public static final c f61549a;
    public static final c[] f61550b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f61549a = r02;
        f61550b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f61550b.clone();
    }
}
