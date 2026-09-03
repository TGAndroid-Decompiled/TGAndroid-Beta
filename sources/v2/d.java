package v2;
public final class d {
    public static final d f45624a;
    public static final d f45625b;
    public static final d f45626c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f45624a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f45625b = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f45626c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
