package xh;

import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.q61;
public final class a1 extends g.o {
    public final r1 f51208c;

    public a1(r1 r1Var) {
        this.f51208c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f51208c;
        e00 e00Var = r1Var.f51532j0;
        d71 d71Var = r1Var.Y;
        if (d71Var != null && i10 != 0) {
            q61 G = d71Var.G(i10 - 1);
            if (G != null && (i11 = G.f30072u) != -1) {
                return i11;
            }
            return e00Var.J;
        }
        return e00Var.J;
    }
}
