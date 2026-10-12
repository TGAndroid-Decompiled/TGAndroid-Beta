package w7;
public final class c {
    public static final c f50146a;
    public static final c[] f50147b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f50146a = r02;
        f50147b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f50147b.clone();
    }
}
