package qb;

public final class b {
    L(1),
    M(0),
    Q(3),
    H(2);

    public static final b[] d;

    public final int f46182a;

    static {
        b bVar = L;
        b bVar2 = M;
        d = new b[]{bVar2, bVar, bVar, bVar};
    }

    public b(int i10) {
        super(str, i);
        this.f46182a = i10;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f46181e.clone();
    }
}
