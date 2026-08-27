package t2;

public final class d {

    public static final d f48012a;

    public static final d f48013b;

    public static final d f48014c;
    public static final d[] d;

    static {
        d dVar = new d("DEFAULT", 0);
        f48012a = dVar;
        d dVar2 = new d("VERY_LOW", 1);
        f48013b = dVar2;
        d dVar3 = new d("HIGHEST", 2);
        f48014c = dVar3;
        d = new d[]{dVar, dVar2, dVar3};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
