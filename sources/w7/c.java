package w7;
public final class c {
    public static final c f52495a;
    public static final c[] f52496b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f52495a = r02;
        f52496b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f52496b.clone();
    }
}
