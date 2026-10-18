package w7;
public final class c {
    public static final c f48603a;
    public static final c[] f48604b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48603a = r02;
        f48604b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48604b.clone();
    }
}
