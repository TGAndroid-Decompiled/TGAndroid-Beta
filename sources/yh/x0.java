package yh;

import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wz;
public final class x0 extends g.o {
    public final o1 f50570c;

    public x0(o1 o1Var) {
        this.f50570c = o1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        o1 o1Var = this.f50570c;
        wz wzVar = o1Var.f50430j0;
        t61 t61Var = o1Var.Y;
        if (t61Var != null && i10 != 0) {
            g61 G = t61Var.G(i10 - 1);
            if (G != null && (i11 = G.f26508u) != -1) {
                return i11;
            }
            return wzVar.J;
        }
        return wzVar.J;
    }
}
