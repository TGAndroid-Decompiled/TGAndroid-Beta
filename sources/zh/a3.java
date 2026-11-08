package zh;
public final class a3 {
    public static final a3 f60205a;
    public static final a3 f60206b;
    public static final a3 f60207c;
    public static final a3[] d;

    static {
        ?? r02 = new Enum("BY_PRICE", 0);
        f60205a = r02;
        ?? r12 = new Enum("BY_DATE", 1);
        f60206b = r12;
        ?? r32 = new Enum("BY_NUMBER", 2);
        f60207c = r32;
        d = new a3[]{r02, r12, r32};
    }

    public static a3 valueOf(String str) {
        return (a3) Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) d.clone();
    }
}
