package yh;

import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wz;
public final class x0 extends g.o {
    public final o1 f50581c;

    public x0(o1 o1Var) {
        this.f50581c = o1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        o1 o1Var = this.f50581c;
        wz wzVar = o1Var.f50441j0;
        u61 u61Var = o1Var.Y;
        if (u61Var != null && i10 != 0) {
            h61 G = u61Var.G(i10 - 1);
            if (G != null && (i11 = G.f26795u) != -1) {
                return i11;
            }
            return wzVar.J;
        }
        return wzVar.J;
    }
}
