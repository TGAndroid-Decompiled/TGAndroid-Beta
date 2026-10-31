package zf;

import android.view.ViewGroup;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.do0;
public final class c1 extends sk0 {
    public x0 f55462c;
    public Integer d;
    public do0 e;
    public boolean f55463f;
    public int h;

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.b() == 0) {
            return false;
        }
        return this.f55462c.D(c1Var);
    }

    @Override
    public final int b() {
        x0 x0Var = this.f55462c;
        int K = x0Var.K();
        x0Var.M0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f55462c.d(i10 - 1);
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        if (i10 > 0) {
            this.f55462c.t(c1Var, i10 - 1);
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            do0 do0Var = new do0(this, viewGroup.getContext(), 15);
            this.e = do0Var;
            return new s4.c1(do0Var);
        }
        return this.f55462c.w(viewGroup, i10);
    }
}
