package zb;
public final class g implements q9.d {
    public static final g f49177b = new g(0);
    public static final g f49178c = new g(1);
    public static final g d = new g(2);
    public final int f49179a;

    public g(int i10) {
        this.f49179a = i10;
    }

    @Override
    public final Object G(cf.c cVar) {
        switch (this.f49179a) {
            case 0:
                return new e((qb.g) cVar.b(qb.g.class));
            case 1:
                return new d((e) cVar.b(e.class), (qb.d) cVar.b(qb.d.class));
            default:
                return new wb.b(cVar.e(d.class));
        }
    }
}
