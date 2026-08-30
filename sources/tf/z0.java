package tf;

import android.view.ViewGroup;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.gw0;
public final class z0 extends rl0 {
    public u0 f44924c;
    public Integer d;
    public gw0 e;
    public boolean f44925f;
    public int h;

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.b() == 0) {
            return false;
        }
        return this.f44924c.D(l1Var);
    }

    @Override
    public final int h() {
        u0 u0Var = this.f44924c;
        int K = u0Var.K();
        u0Var.I0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f44924c.j(i10 - 1);
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        if (i10 > 0) {
            this.f44924c.v(l1Var, i10 - 1);
        }
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            gw0 gw0Var = new gw0(this, viewGroup.getContext(), 10);
            this.e = gw0Var;
            return new f2.l1(gw0Var);
        }
        return this.f44924c.x(viewGroup, i10);
    }
}
