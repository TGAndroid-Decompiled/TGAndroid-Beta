package p4;

import java.util.List;
public final class o0 implements y0, z0 {
    public final int f53411a;
    public final c1 f53412b;
    public final int f53413c;

    public o0(c1 c1Var, int i7, int i10) {
        this.f53411a = i10;
        this.f53412b = c1Var;
        this.f53413c = i7;
    }

    @Override
    public void a(g1 g1Var, v vVar, List list) {
        switch (this.f53411a) {
            case 1:
                g1Var.b0(this.f53412b.m1(vVar, g1Var, this.f53413c), list);
                return;
            case 2:
                c1 c1Var = this.f53412b;
                c1Var.getClass();
                int size = list.size();
                int i7 = this.f53413c;
                if (size == 1) {
                    g1Var.o(c1Var.m1(vVar, g1Var, i7), (e2.l0) list.get(0));
                    return;
                } else {
                    g1Var.s0(list, c1Var.m1(vVar, g1Var, i7), c1Var.m1(vVar, g1Var, i7 + 1));
                    return;
                }
            default:
                g1Var.b0(this.f53412b.m1(vVar, g1Var, this.f53413c), list);
                return;
        }
    }

    @Override
    public void c(g1 g1Var, v vVar) {
        switch (this.f53411a) {
            case 0:
                g1Var.Y(this.f53412b.m1(vVar, g1Var, this.f53413c));
                return;
            default:
                g1Var.Q(this.f53412b.m1(vVar, g1Var, this.f53413c));
                return;
        }
    }
}
