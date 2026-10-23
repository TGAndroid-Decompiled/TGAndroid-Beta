package yh;

import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.wz;
public final class x0 extends g.o {
    public final o1 f51038c;

    public x0(o1 o1Var) {
        this.f51038c = o1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        o1 o1Var = this.f51038c;
        wz wzVar = o1Var.f50898j0;
        b71 b71Var = o1Var.Y;
        if (b71Var != null && i10 != 0) {
            m61 G = b71Var.G(i10 - 1);
            if (G != null && (i11 = G.f28568u) != -1) {
                return i11;
            }
            return wzVar.J;
        }
        return wzVar.J;
    }
}
