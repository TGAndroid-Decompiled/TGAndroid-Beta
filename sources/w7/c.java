package w7;
public final class c {
    public static final c f48611a;
    public static final c[] f48612b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48611a = r02;
        f48612b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48612b.clone();
    }
}
