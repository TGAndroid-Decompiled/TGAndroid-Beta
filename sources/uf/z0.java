package uf;

import android.view.ViewGroup;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.iw0;
public final class z0 extends sl0 {
    public u0 f48785c;
    public Integer d;
    public iw0 f48786e;
    public boolean f48787f;
    public int h;

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.b() == 0) {
            return false;
        }
        return this.f48785c.D(m1Var);
    }

    @Override
    public final int h() {
        u0 u0Var = this.f48785c;
        int K = u0Var.K();
        u0Var.I0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f48785c.j(i10 - 1);
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        if (i10 > 0) {
            this.f48785c.v(m1Var, i10 - 1);
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            iw0 iw0Var = new iw0(this, viewGroup.getContext(), 10);
            this.f48786e = iw0Var;
            return new f2.m1(iw0Var);
        }
        return this.f48785c.x(viewGroup, i10);
    }
}
