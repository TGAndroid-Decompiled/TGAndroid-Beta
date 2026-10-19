package yh;

import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wz;
public final class i4 extends g.o {
    public final k4 f50299c;

    public i4(k4 k4Var) {
        this.f50299c = k4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.f50299c;
        wz wzVar = k4Var.f50342a0;
        t61 t61Var = k4Var.f50346e0;
        if (t61Var == null) {
            return wzVar.J;
        }
        g61 G = t61Var.G(i10 - 1);
        if (G != null && (i11 = G.f26506u) != -1) {
            return i11;
        }
        return wzVar.J;
    }
}
