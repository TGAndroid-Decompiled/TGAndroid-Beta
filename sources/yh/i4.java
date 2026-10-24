package yh;

import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.uz;
public final class i4 extends g.o {
    public final k4 f50759c;

    public i4(k4 k4Var) {
        this.f50759c = k4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        k4 k4Var = this.f50759c;
        uz uzVar = k4Var.f50802a0;
        a71 a71Var = k4Var.f50808g0;
        if (a71Var == null) {
            return uzVar.J;
        }
        l61 G = a71Var.G(i10 - 1);
        if (G != null && (i11 = G.f28236u) != -1) {
            return i11;
        }
        return uzVar.J;
    }
}
