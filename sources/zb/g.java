package zb;

import ci.u5;
public final class g implements q9.d {
    public static final g f54360b = new g(0);
    public static final g f54361c = new g(1);
    public static final g d = new g(2);
    public final int f54362a;

    public g(int i10) {
        this.f54362a = i10;
    }

    @Override
    public final Object y0(u5 u5Var) {
        switch (this.f54362a) {
            case 0:
                return new e((qb.g) u5Var.a(qb.g.class));
            case 1:
                return new d((e) u5Var.a(e.class), (qb.d) u5Var.a(qb.d.class));
            default:
                return new wb.b(u5Var.c(d.class));
        }
    }
}
