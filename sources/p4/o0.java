package p4;

import java.util.List;
public final class o0 implements a1, b1, h2.j {
    public final e1 f55422a;
    public final int f55423b;
    public final int f55424c;

    public o0(e1 e1Var, int i7, int i10) {
        this.f55422a = e1Var;
        this.f55423b = i7;
        this.f55424c = i10;
    }

    @Override
    public void a(i1 i1Var, v vVar, List list) {
        e1 e1Var = this.f55422a;
        i1Var.s0(list, e1Var.m1(vVar, i1Var, this.f55423b), e1Var.m1(vVar, i1Var, this.f55424c));
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) obj;
        e1 e1Var = this.f55422a;
        ((e0) e1Var.f55255a.get()).getClass();
        d1 d1Var = e1Var.f55260i;
        if (d1Var != null) {
            d1Var.setFixedSize(this.f55423b, this.f55424c);
        }
    }

    @Override
    public void c(i1 i1Var, v vVar) {
        e1 e1Var = this.f55422a;
        i1Var.R(e1Var.m1(vVar, i1Var, this.f55423b), e1Var.m1(vVar, i1Var, this.f55424c));
    }
}
