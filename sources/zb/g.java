package zb;

import bi.u6;
public final class g implements q9.d {
    public static final g f47976b = new g(0);
    public static final g f47977c = new g(1);
    public static final g d = new g(2);
    public final int f47978a;

    public g(int i10) {
        this.f47978a = i10;
    }

    @Override
    public final Object P1(u6 u6Var) {
        switch (this.f47978a) {
            case 0:
                return new e((qb.g) u6Var.a(qb.g.class));
            case 1:
                return new d((e) u6Var.a(e.class), (qb.d) u6Var.a(qb.d.class));
            default:
                return new wb.b(u6Var.c(d.class));
        }
    }
}
