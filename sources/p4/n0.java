package p4;

import java.util.List;
public final class n0 implements y0, z0, h2.j {
    public final c1 f53270a;
    public final int f53271b;
    public final int f53272c;

    public n0(c1 c1Var, int i7, int i10) {
        this.f53270a = c1Var;
        this.f53271b = i7;
        this.f53272c = i10;
    }

    @Override
    public void a(g1 g1Var, v vVar, List list) {
        c1 c1Var = this.f53270a;
        g1Var.s0(list, c1Var.M0(vVar, g1Var, this.f53271b), c1Var.M0(vVar, g1Var, this.f53272c));
    }

    @Override
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        c1 c1Var = this.f53270a;
        ((d0) c1Var.f53065a.get()).getClass();
        b1 b1Var = c1Var.f53070i;
        if (b1Var != null) {
            b1Var.setFixedSize(this.f53271b, this.f53272c);
        }
    }

    @Override
    public void c(g1 g1Var, v vVar) {
        c1 c1Var = this.f53270a;
        g1Var.R(c1Var.M0(vVar, g1Var, this.f53271b), c1Var.M0(vVar, g1Var, this.f53272c));
    }
}
