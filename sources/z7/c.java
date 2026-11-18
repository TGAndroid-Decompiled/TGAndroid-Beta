package z7;
public final class c {
    public static final c f61503a;
    public static final c[] f61504b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f61503a = r02;
        f61504b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f61504b.clone();
    }
}
