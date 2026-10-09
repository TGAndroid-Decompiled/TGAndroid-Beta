package xh;

import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.p61;
public final class k4 extends g.o {
    public final m4 f51324c;

    public k4(m4 m4Var) {
        this.f51324c = m4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        m4 m4Var = this.f51324c;
        d00 d00Var = m4Var.f51375a0;
        c71 c71Var = m4Var.f51379e0;
        if (c71Var == null) {
            return d00Var.J;
        }
        p61 G = c71Var.G(i10 - 1);
        if (G != null && (i11 = G.f29743u) != -1) {
            return i11;
        }
        return d00Var.J;
    }
}
