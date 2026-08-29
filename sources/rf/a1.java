package rf;

import android.view.ViewGroup;
import f2.n1;
import org.telegram.ui.Components.il0;
import org.telegram.ui.op0;
public final class a1 extends il0 {
    public v0 f47172c;
    public Integer d;
    public op0 f47173e;
    public boolean f47174f;
    public int h;

    @Override
    public final boolean D(n1 n1Var) {
        if (n1Var.b() == 0) {
            return false;
        }
        return this.f47172c.D(n1Var);
    }

    @Override
    public final int h() {
        v0 v0Var = this.f47172c;
        int K = v0Var.K();
        v0Var.H0 = K;
        return K + 1;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return -983904;
        }
        return this.f47172c.j(i10 - 1);
    }

    @Override
    public final void v(n1 n1Var, int i10) {
        if (i10 > 0) {
            this.f47172c.v(n1Var, i10 - 1);
        }
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        if (i10 == -983904) {
            op0 op0Var = new op0(this, viewGroup.getContext(), 10);
            this.f47173e = op0Var;
            return new n1(op0Var);
        }
        return this.f47172c.x(viewGroup, i10);
    }
}
