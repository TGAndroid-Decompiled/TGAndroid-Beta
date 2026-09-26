package xh;

import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.w51;
public final class z0 extends g.p {
    public final r1 f46499c;

    public z0(r1 r1Var) {
        this.f46499c = r1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        r1 r1Var = this.f46499c;
        pz pzVar = r1Var.f46375j0;
        k61 k61Var = r1Var.Y;
        if (k61Var != null && i10 != 0) {
            w51 G = k61Var.G(i10 - 1);
            if (G != null && (i11 = G.f29904u) != -1) {
                return i11;
            }
            return pzVar.J;
        }
        return pzVar.J;
    }
}
