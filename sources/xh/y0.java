package xh;

import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.x51;
public final class y0 extends g.p {
    public final q1 f46229c;

    public y0(q1 q1Var) {
        this.f46229c = q1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        q1 q1Var = this.f46229c;
        nz nzVar = q1Var.f46108j0;
        x51 x51Var = q1Var.Y;
        if (x51Var != null && i10 != 0) {
            j51 G = x51Var.G(i10 - 1);
            if (G != null && (i11 = G.f25133u) != -1) {
                return i11;
            }
            return nzVar.J;
        }
        return nzVar.J;
    }
}
