package xh;

import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.r61;
public final class a1 extends g.o {
    public final r1 f51251c;

    public a1(r1 r1Var) {
        this.f51251c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f51251c;
        e00 e00Var = r1Var.f51575j0;
        e71 e71Var = r1Var.Y;
        if (e71Var != null && i10 != 0) {
            r61 G = e71Var.G(i10 - 1);
            if (G != null && (i11 = G.f30370u) != -1) {
                return i11;
            }
            return e00Var.J;
        }
        return e00Var.J;
    }
}
