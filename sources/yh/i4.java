package yh;

import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.wz;
public final class i4 extends g.o {
    public final k4 f50298c;

    public i4(k4 k4Var) {
        this.f50298c = k4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.f50298c;
        wz wzVar = k4Var.f50341a0;
        s61 s61Var = k4Var.f50345e0;
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
