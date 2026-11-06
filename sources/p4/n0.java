package p4;

import java.util.List;
public final class n0 implements y0, z0, h2.j {
    public final c1 f53294a;
    public final int f53295b;
    public final int f53296c;

    public n0(c1 c1Var, int i7, int i10) {
        this.f53294a = c1Var;
        this.f53295b = i7;
        this.f53296c = i10;
    }

    @Override
    public void a(g1 g1Var, v vVar, List list) {
        c1 c1Var = this.f53294a;
        g1Var.s0(list, c1Var.M0(vVar, g1Var, this.f53295b), c1Var.M0(vVar, g1Var, this.f53296c));
    }

    @Override
    public void accept(Object obj) {
        g1 g1Var = (g1) obj;
        c1 c1Var = this.f53294a;
        ((d0) c1Var.f53089a.get()).getClass();
        b1 b1Var = c1Var.f53094i;
        if (b1Var != null) {
            b1Var.setFixedSize(this.f53295b, this.f53296c);
        }
    }

    @Override
    public void c(g1 g1Var, v vVar) {
        c1 c1Var = this.f53294a;
        g1Var.R(c1Var.M0(vVar, g1Var, this.f53295b), c1Var.M0(vVar, g1Var, this.f53296c));
    }
}
