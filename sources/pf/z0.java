package pf;

import android.view.ViewGroup;
import f2.o1;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.aj0;

public final class z0 extends yk0 {

    public u0 f46013c;
    public Integer d;

    public aj0 f46014e;

    public boolean f46015f;
    public int h;

    @Override
    public final boolean D(o1 o1Var) {
        if (o1Var.b() == 0) {
            return false;
        }
        return this.f46013c.D(o1Var);
    }

    @Override
    public final int h() {
        u0 u0Var = this.f46013c;
        int iK = u0Var.K();
        u0Var.H0 = iK;
        return iK + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f46013c.j(i10 - 1);
    }

    @Override
    public final void v(o1 o1Var, int i10) {
        if (i10 > 0) {
            this.f46013c.v(o1Var, i10 - 1);
        }
    }

    @Override
    public final o1 x(ViewGroup viewGroup, int i10) {
        if (i10 != -983904) {
            return this.f46013c.x(viewGroup, i10);
        }
        aj0 aj0Var = new aj0(this, viewGroup.getContext(), 10);
        this.f46014e = aj0Var;
        return new lk0(aj0Var);
    }
}
