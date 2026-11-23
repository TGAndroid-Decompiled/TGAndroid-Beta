package p4;

import java.util.List;
public final class n0 implements a1, b1, h2.j {
    public final e1 f55359a;
    public final int f55360b;
    public final int f55361c;

    public n0(e1 e1Var, int i7, int i10) {
        this.f55359a = e1Var;
        this.f55360b = i7;
        this.f55361c = i10;
    }

    @Override
    public void a(i1 i1Var, v vVar, List list) {
        e1 e1Var = this.f55359a;
        i1Var.s0(list, e1Var.m1(vVar, i1Var, this.f55360b), e1Var.m1(vVar, i1Var, this.f55361c));
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) obj;
        e1 e1Var = this.f55359a;
        ((d0) e1Var.f55219a.get()).getClass();
        d1 d1Var = e1Var.f55224i;
        if (d1Var != null) {
            d1Var.setFixedSize(this.f55360b, this.f55361c);
        }
    }

    @Override
    public void c(i1 i1Var, v vVar) {
        e1 e1Var = this.f55359a;
        i1Var.R(e1Var.m1(vVar, i1Var, this.f55360b), e1Var.m1(vVar, i1Var, this.f55361c));
    }
}
