package z7;
public final class c {
    public static final c f59739a;
    public static final c[] f59740b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59739a = r02;
        f59740b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f59740b.clone();
    }
}
