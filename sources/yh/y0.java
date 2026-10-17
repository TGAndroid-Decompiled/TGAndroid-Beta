package yh;

import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.wz;
public final class y0 extends g.o {
    public final p1 f50606c;

    public y0(p1 p1Var) {
        this.f50606c = p1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.f50606c;
        wz wzVar = p1Var.f50466j0;
        s61 s61Var = p1Var.Y;
        if (s61Var != null && i10 != 0) {
            f61 G = s61Var.G(i10 - 1);
            if (G != null && (i11 = G.f26149u) != -1) {
                return i11;
            }
            return wzVar.J;
        }
        return wzVar.J;
    }
}
