package xh;

import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.w61;
public final class k4 extends g.p {
    public final m4 f50078c;

    public k4(m4 m4Var) {
        this.f50078c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f50078c;
        qz qzVar = m4Var.f50129a0;
        w61 w61Var = m4Var.f50133e0;
        if (w61Var == null) {
            return qzVar.J;
        }
        h61 G = w61Var.G(i10 - 1);
        if (G != null && (i11 = G.f27102u) != -1) {
            return i11;
        }
        return qzVar.J;
    }
}
