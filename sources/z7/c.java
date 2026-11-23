package z7;
public final class c {
    public static final c f61633a;
    public static final c[] f61634b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f61633a = r02;
        f61634b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f61634b.clone();
    }
}
