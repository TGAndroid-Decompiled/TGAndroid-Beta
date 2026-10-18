package yh;

import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.wz;
public final class j4 extends g.o {
    public final l4 f50358c;

    public j4(l4 l4Var) {
        this.f50358c = l4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.f50358c;
        wz wzVar = l4Var.f50401a0;
        s61 s61Var = l4Var.f50405e0;
        if (s61Var == null) {
            return wzVar.J;
        }
        f61 G = s61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26156u) != -1) {
            return i11;
        }
        return wzVar.J;
    }
}
