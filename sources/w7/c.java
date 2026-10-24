package w7;
public final class c {
    public static final c f49051a;
    public static final c[] f49052b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f49051a = r02;
        f49052b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f49052b.clone();
    }
}
