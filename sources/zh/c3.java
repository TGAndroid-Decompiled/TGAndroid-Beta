package zh;
public final class c3 {
    public static final c3 f60154a;
    public static final c3 f60155b;
    public static final c3 f60156c;
    public static final c3[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f60154a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f60155b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f60156c = r32;
        d = new c3[]{r02, r12, r32};
    }

    public static c3 valueOf(String str) {
        return (c3) Enum.valueOf(c3.class, str);
    }

    public static c3[] values() {
        return (c3[]) d.clone();
    }
}
