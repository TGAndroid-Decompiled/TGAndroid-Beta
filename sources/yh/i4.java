package yh;

import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wz;
public final class i4 extends g.o {
    public final k4 f50307c;

    public i4(k4 k4Var) {
        this.f50307c = k4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.f50307c;
        wz wzVar = k4Var.f50350a0;
        u61 u61Var = k4Var.f50354e0;
        if (u61Var == null) {
            return wzVar.J;
        }
        h61 G = u61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26794u) != -1) {
            return i11;
        }
        return wzVar.J;
    }
}
