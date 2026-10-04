package w7;
public final class c {
    public static final c f48610a;
    public static final c[] f48611b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48610a = r02;
        f48611b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48611b.clone();
    }
}
