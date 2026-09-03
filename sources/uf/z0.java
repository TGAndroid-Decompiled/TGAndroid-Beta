package uf;

import android.view.ViewGroup;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.nw0;
public final class z0 extends rl0 {
    public u0 f48821c;
    public Integer d;
    public nw0 f48822e;
    public boolean f48823f;
    public int h;

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.b() == 0) {
            return false;
        }
        return this.f48821c.D(m1Var);
    }

    @Override
    public final int h() {
        u0 u0Var = this.f48821c;
        int K = u0Var.K();
        u0Var.I0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f48821c.j(i10 - 1);
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        if (i10 > 0) {
            this.f48821c.v(m1Var, i10 - 1);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            nw0 nw0Var = new nw0(this, viewGroup.getContext(), 10);
            this.f48822e = nw0Var;
            return new f2.m1(nw0Var);
        }
        return this.f48821c.x(viewGroup, i10);
    }
}
