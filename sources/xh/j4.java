package xh;

import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.u61;
public final class j4 extends g.o {
    public final l4 f51539c;

    public j4(l4 l4Var) {
        this.f51539c = l4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.f51539c;
        g00 g00Var = l4Var.f51570a0;
        h71 h71Var = l4Var.f51574e0;
        if (h71Var == null) {
            return g00Var.J;
        }
        u61 G = h71Var.G(i10 - 1);
        if (G != null && (i11 = G.f31085u) != -1) {
            return i11;
        }
        return g00Var.J;
    }
}
