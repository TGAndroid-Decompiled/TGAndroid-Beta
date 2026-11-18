package p4;

import java.util.List;
public final class p0 implements a1, b1 {
    public final int f55386a;
    public final e1 f55387b;
    public final int f55388c;

    public p0(e1 e1Var, int i7, int i10) {
        this.f55386a = i10;
        this.f55387b = e1Var;
        this.f55388c = i7;
    }

    @Override
    public void a(i1 i1Var, v vVar, List list) {
        switch (this.f55386a) {
            case 1:
                i1Var.b0(this.f55387b.m1(vVar, i1Var, this.f55388c), list);
                return;
            case 2:
                e1 e1Var = this.f55387b;
                e1Var.getClass();
                int size = list.size();
                int i7 = this.f55388c;
                if (size == 1) {
                    i1Var.o(e1Var.m1(vVar, i1Var, i7), (e2.l0) list.get(0));
                    return;
                } else {
                    i1Var.s0(list, e1Var.m1(vVar, i1Var, i7), e1Var.m1(vVar, i1Var, i7 + 1));
                    return;
                }
            default:
                i1Var.b0(this.f55387b.m1(vVar, i1Var, this.f55388c), list);
                return;
        }
    }

    @Override
    public void c(i1 i1Var, v vVar) {
        switch (this.f55386a) {
            case 0:
                i1Var.Y(this.f55387b.m1(vVar, i1Var, this.f55388c));
                return;
            default:
                i1Var.Q(this.f55387b.m1(vVar, i1Var, this.f55388c));
                return;
        }
    }
}
