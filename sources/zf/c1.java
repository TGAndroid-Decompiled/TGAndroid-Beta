package zf;

import android.view.ViewGroup;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.bo0;
public final class c1 extends tk0 {
    public x0 f55480c;
    public Integer d;
    public bo0 e;
    public boolean f55481f;
    public int h;

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() == 0) {
            return false;
        }
        return this.f55480c.D(c1Var);
    }

    @Override
    public final int b() {
        x0 x0Var = this.f55480c;
        int K = x0Var.K();
        x0Var.M0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f55480c.d(i10 - 1);
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        if (i10 > 0) {
            this.f55480c.t(c1Var, i10 - 1);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            bo0 bo0Var = new bo0(this, viewGroup.getContext(), 15);
            this.e = bo0Var;
            return new s4.c1(bo0Var);
        }
        return this.f55480c.w(viewGroup, i10);
    }
}
