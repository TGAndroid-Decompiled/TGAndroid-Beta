package xh;

import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.x51;
public final class k4 extends g.p {
    public final m4 f46253c;

    public k4(m4 m4Var) {
        this.f46253c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f46253c;
        pz pzVar = m4Var.f46294a0;
        l61 l61Var = m4Var.f46298e0;
        if (l61Var == null) {
            return pzVar.J;
        }
        x51 G = l61Var.G(i10 - 1);
        if (G != null && (i11 = G.f30302u) != -1) {
            return i11;
        }
        return pzVar.J;
    }
}
