package w7;
public final class c {
    public static final c f49052a;
    public static final c[] f49053b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49052a = r02;
        f49053b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f49053b.clone();
    }
}
