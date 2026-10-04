package xh;

import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.u61;
public final class z0 extends g.p {
    public final q1 f50332c;

    public z0(q1 q1Var) {
        this.f50332c = q1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        q1 q1Var = this.f50332c;
        qz qzVar = q1Var.f50197j0;
        u61 u61Var = q1Var.Y;
        if (u61Var != null && i10 != 0) {
            g61 G = u61Var.G(i10 - 1);
            if (G != null && (i11 = G.f26683u) != -1) {
                return i11;
            }
            return qzVar.J;
        }
        return qzVar.J;
    }
}
