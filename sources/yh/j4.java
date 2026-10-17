package yh;

import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.wz;
public final class j4 extends g.o {
    public final l4 f50333c;

    public j4(l4 l4Var) {
        this.f50333c = l4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.f50333c;
        wz wzVar = l4Var.f50376a0;
        s61 s61Var = l4Var.f50380e0;
        if (s61Var == null) {
            return wzVar.J;
        }
        f61 G = s61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26149u) != -1) {
            return i11;
        }
        return wzVar.J;
    }
}
