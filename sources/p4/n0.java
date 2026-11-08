package p4;

import java.util.List;
public final class n0 implements y0, z0, h2.j {
    public final c1 f53387a;
    public final int f53388b;
    public final int f53389c;

    public n0(c1 c1Var, int i7, int i10) {
        this.f53387a = c1Var;
        this.f53388b = i7;
        this.f53389c = i10;
    }

    @Override
    public void a(g1 g1Var, v vVar, List list) {
        c1 c1Var = this.f53387a;
        g1Var.s0(list, c1Var.m1(vVar, g1Var, this.f53388b), c1Var.m1(vVar, g1Var, this.f53389c));
    }

    @Override
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        c1 c1Var = this.f53387a;
        ((d0) c1Var.f53182a.get()).getClass();
        b1 b1Var = c1Var.f53187i;
        if (b1Var != null) {
            b1Var.setFixedSize(this.f53388b, this.f53389c);
        }
    }

    @Override
    public void c(g1 g1Var, v vVar) {
        c1 c1Var = this.f53387a;
        g1Var.R(c1Var.m1(vVar, g1Var, this.f53388b), c1Var.m1(vVar, g1Var, this.f53389c));
    }
}
