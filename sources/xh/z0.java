package xh;

import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.u61;
public final class z0 extends g.o {
    public final q1 f51866c;

    public z0(q1 q1Var) {
        this.f51866c = q1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        q1 q1Var = this.f51866c;
        g00 g00Var = q1Var.f51705j0;
        h71 h71Var = q1Var.Y;
        if (h71Var != null && i10 != 0) {
            u61 G = h71Var.G(i10 - 1);
            if (G != null && (i11 = G.f31080u) != -1) {
                return i11;
            }
            return g00Var.J;
        }
        return g00Var.J;
    }
}
