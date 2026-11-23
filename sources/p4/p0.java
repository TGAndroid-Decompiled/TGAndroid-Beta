package p4;

import java.util.List;
public final class p0 implements z0, a1 {
    public final int f55516a;
    public final d1 f55517b;
    public final int f55518c;

    public p0(d1 d1Var, int i7, int i10) {
        this.f55516a = i10;
        this.f55517b = d1Var;
        this.f55518c = i7;
    }

    @Override
    public void a(h1 h1Var, v vVar, List list) {
        switch (this.f55516a) {
            case 1:
                h1Var.c0(this.f55517b.m1(vVar, h1Var, this.f55518c), list);
                return;
            case 2:
                d1 d1Var = this.f55517b;
                d1Var.getClass();
                int size = list.size();
                int i7 = this.f55518c;
                if (size == 1) {
                    h1Var.p(d1Var.m1(vVar, h1Var, i7), (e2.l0) list.get(0));
                    return;
                } else {
                    h1Var.t0(list, d1Var.m1(vVar, h1Var, i7), d1Var.m1(vVar, h1Var, i7 + 1));
                    return;
                }
            default:
                h1Var.c0(this.f55517b.m1(vVar, h1Var, this.f55518c), list);
                return;
        }
    }

    @Override
    public void c(h1 h1Var, v vVar) {
        switch (this.f55516a) {
            case 0:
                h1Var.Z(this.f55517b.m1(vVar, h1Var, this.f55518c));
                return;
            default:
                h1Var.R(this.f55517b.m1(vVar, h1Var, this.f55518c));
                return;
        }
    }
}
