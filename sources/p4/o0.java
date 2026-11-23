package p4;

import java.util.List;
public final class o0 implements z0, a1, h2.j {
    public final d1 f55510a;
    public final int f55511b;
    public final int f55512c;

    public o0(d1 d1Var, int i7, int i10) {
        this.f55510a = d1Var;
        this.f55511b = i7;
        this.f55512c = i10;
    }

    @Override
    public void a(h1 h1Var, v vVar, List list) {
        d1 d1Var = this.f55510a;
        h1Var.t0(list, d1Var.m1(vVar, h1Var, this.f55511b), d1Var.m1(vVar, h1Var, this.f55512c));
    }

    @Override
    public void accept(Object obj) {
        h1 h1Var = (h1) obj;
        d1 d1Var = this.f55510a;
        ((d0) d1Var.f55330a.get()).getClass();
        c1 c1Var = d1Var.f55335i;
        if (c1Var != null) {
            c1Var.setFixedSize(this.f55511b, this.f55512c);
        }
    }

    @Override
    public void c(h1 h1Var, v vVar) {
        d1 d1Var = this.f55510a;
        h1Var.S(d1Var.m1(vVar, h1Var, this.f55511b), d1Var.m1(vVar, h1Var, this.f55512c));
    }
}
