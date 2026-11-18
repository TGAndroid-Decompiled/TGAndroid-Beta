package p4;

import java.util.List;
public final class n0 implements a1, b1, h2.j {
    public final e1 f55349a;
    public final int f55350b;
    public final int f55351c;

    public n0(e1 e1Var, int i7, int i10) {
        this.f55349a = e1Var;
        this.f55350b = i7;
        this.f55351c = i10;
    }

    @Override
    public void a(i1 i1Var, v vVar, List list) {
        e1 e1Var = this.f55349a;
        i1Var.s0(list, e1Var.m1(vVar, i1Var, this.f55350b), e1Var.m1(vVar, i1Var, this.f55351c));
    }

    @Override
    public void accept(Object obj) {
        i1 i1Var = (i1) obj;
        e1 e1Var = this.f55349a;
        ((d0) e1Var.f55209a.get()).getClass();
        d1 d1Var = e1Var.f55214i;
        if (d1Var != null) {
            d1Var.setFixedSize(this.f55350b, this.f55351c);
        }
    }

    @Override
    public void c(i1 i1Var, v vVar) {
        e1 e1Var = this.f55349a;
        i1Var.R(e1Var.m1(vVar, i1Var, this.f55350b), e1Var.m1(vVar, i1Var, this.f55351c));
    }
}
