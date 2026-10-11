package xh;

import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.r61;
public final class k4 extends g.o {
    public final m4 f51413c;

    public k4(m4 m4Var) {
        this.f51413c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f51413c;
        e00 e00Var = m4Var.f51464a0;
        e71 e71Var = m4Var.f51468e0;
        if (e71Var == null) {
            return e00Var.J;
        }
        r61 G = e71Var.G(i10 - 1);
        if (G != null && (i11 = G.f30370u) != -1) {
            return i11;
        }
        return e00Var.J;
    }
}
