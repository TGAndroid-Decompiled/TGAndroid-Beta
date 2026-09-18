package w7;
public final class c {
    public static final c f44642a;
    public static final c[] f44643b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f44642a = r02;
        f44643b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f44643b.clone();
    }
}
