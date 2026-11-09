package p4;

import java.util.List;
public final class n0 implements y0, z0, h2.j {
    public final c1 f53400a;
    public final int f53401b;
    public final int f53402c;

    public n0(c1 c1Var, int i7, int i10) {
        this.f53400a = c1Var;
        this.f53401b = i7;
        this.f53402c = i10;
    }

    @Override
    public void a(g1 g1Var, v vVar, List list) {
        c1 c1Var = this.f53400a;
        g1Var.s0(list, c1Var.m1(vVar, g1Var, this.f53401b), c1Var.m1(vVar, g1Var, this.f53402c));
    }

    @Override
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        c1 c1Var = this.f53400a;
        ((d0) c1Var.f53195a.get()).getClass();
        b1 b1Var = c1Var.f53200i;
        if (b1Var != null) {
            b1Var.setFixedSize(this.f53401b, this.f53402c);
        }
    }

    @Override
    public void c(g1 g1Var, v vVar) {
        c1 c1Var = this.f53400a;
        g1Var.R(c1Var.m1(vVar, g1Var, this.f53401b), c1Var.m1(vVar, g1Var, this.f53402c));
    }
}
