package xh;

import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.v51;
public final class k4 extends g.p {
    public final m4 f46253c;

    public k4(m4 m4Var) {
        this.f46253c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f46253c;
        oz ozVar = m4Var.f46294a0;
        j61 j61Var = m4Var.f46298e0;
        if (j61Var == null) {
            return ozVar.J;
        }
        v51 G = j61Var.G(i10 - 1);
        if (G != null && (i11 = G.f29058u) != -1) {
            return i11;
        }
        return ozVar.J;
    }
}
