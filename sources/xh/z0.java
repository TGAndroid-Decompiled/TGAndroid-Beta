package xh;

import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.w61;
public final class z0 extends g.p {
    public final q1 f50339c;

    public z0(q1 q1Var) {
        this.f50339c = q1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        q1 q1Var = this.f50339c;
        qz qzVar = q1Var.f50204j0;
        w61 w61Var = q1Var.Y;
        if (w61Var != null && i10 != 0) {
            h61 G = w61Var.G(i10 - 1);
            if (G != null && (i11 = G.f27102u) != -1) {
                return i11;
            }
            return qzVar.J;
        }
        return qzVar.J;
    }
}
