package xh;

import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.u61;
public final class k4 extends g.p {
    public final m4 f50071c;

    public k4(m4 m4Var) {
        this.f50071c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f50071c;
        qz qzVar = m4Var.f50122a0;
        u61 u61Var = m4Var.f50126e0;
        if (u61Var == null) {
            return qzVar.J;
        }
        g61 G = u61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26683u) != -1) {
            return i11;
        }
        return qzVar.J;
    }
}
