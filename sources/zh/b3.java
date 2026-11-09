package zh;
public final class b3 {
    public static final b3 f60227a;
    public static final b3 f60228b;
    public static final b3 f60229c;
    public static final b3[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f60227a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f60228b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f60229c = r32;
        d = new b3[]{r02, r12, r32};
    }

    public static b3 valueOf(String str) {
        return (b3) Enum.valueOf(b3.class, str);
    }

    public static b3[] values() {
        return (b3[]) d.clone();
    }
}
