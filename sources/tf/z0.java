package tf;

import android.view.ViewGroup;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.nw0;
public final class z0 extends ql0 {
    public u0 f44986c;
    public Integer d;
    public nw0 e;
    public boolean f44987f;
    public int h;

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.b() == 0) {
            return false;
        }
        return this.f44986c.D(l1Var);
    }

    @Override
    public final int h() {
        u0 u0Var = this.f44986c;
        int K = u0Var.K();
        u0Var.I0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f44986c.j(i10 - 1);
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        if (i10 > 0) {
            this.f44986c.v(l1Var, i10 - 1);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            nw0 nw0Var = new nw0(this, viewGroup.getContext(), 10);
            this.e = nw0Var;
            return new f2.l1(nw0Var);
        }
        return this.f44986c.x(viewGroup, i10);
    }
}
