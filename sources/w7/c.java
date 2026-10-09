package w7;
public final class c {
    public static final c f49911a;
    public static final c[] f49912b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49911a = r02;
        f49912b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f49912b.clone();
    }
}
