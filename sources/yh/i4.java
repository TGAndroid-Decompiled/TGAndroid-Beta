package yh;

import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.wz;
public final class i4 extends g.o {
    public final k4 f50760c;

    public i4(k4 k4Var) {
        this.f50760c = k4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.f50760c;
        wz wzVar = k4Var.f50803a0;
        b71 b71Var = k4Var.f50809g0;
        if (b71Var == null) {
            return wzVar.J;
        }
        m61 G = b71Var.G(i10 - 1);
        if (G != null && (i11 = G.f28568u) != -1) {
            return i11;
        }
        return wzVar.J;
    }
}
