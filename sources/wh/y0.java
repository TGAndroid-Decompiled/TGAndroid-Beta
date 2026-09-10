package wh;

import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.v51;
public final class y0 extends g.p {
    public final p1 f44433c;

    public y0(p1 p1Var) {
        this.f44433c = p1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.f44433c;
        uz uzVar = p1Var.f44296j0;
        j61 j61Var = p1Var.Y;
        if (j61Var != null && i10 != 0) {
            v51 G = j61Var.G(i10 - 1);
            if (G != null && (i11 = G.f27838u) != -1) {
                return i11;
            }
            return uzVar.J;
        }
        return uzVar.J;
    }
}
