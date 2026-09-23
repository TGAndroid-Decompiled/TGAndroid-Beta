package xh;

import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.v51;
public final class k4 extends g.p {
    public final m4 f45924c;

    public k4(m4 m4Var) {
        this.f45924c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f45924c;
        oz ozVar = m4Var.f45965a0;
        v51 v51Var = m4Var.f45969e0;
        if (v51Var == null) {
            return ozVar.J;
        }
        h51 G = v51Var.G(i10 - 1);
        if (G != null && (i11 = G.f24516u) != -1) {
            return i11;
        }
        return ozVar.J;
    }
}
