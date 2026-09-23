package zb;
public final class g implements q9.d {
    public static final g f48801b = new g(0);
    public static final g f48802c = new g(1);
    public static final g d = new g(2);
    public final int f48803a;

    public g(int i10) {
        this.f48803a = i10;
    }

    @Override
    public final Object G(cf.c cVar) {
        switch (this.f48803a) {
            case 0:
                return new e((qb.g) cVar.a(qb.g.class));
            case 1:
                return new d((e) cVar.a(e.class), (qb.d) cVar.a(qb.d.class));
            default:
                return new wb.b(cVar.c(d.class));
        }
    }
}
