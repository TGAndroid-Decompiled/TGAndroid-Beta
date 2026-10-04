package zb;
public final class g implements q9.d {
    public static final g f53182b = new g(0);
    public static final g f53183c = new g(1);
    public static final g d = new g(2);
    public final int f53184a;

    public g(int i10) {
        this.f53184a = i10;
    }

    @Override
    public final Object E(cf.c cVar) {
        switch (this.f53184a) {
            case 0:
                return new e((qb.g) cVar.a(qb.g.class));
            case 1:
                return new d((e) cVar.a(e.class), (qb.d) cVar.a(qb.d.class));
            default:
                return new wb.b(cVar.d(d.class));
        }
    }
}
