package wh;

import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.uz;
import org.telegram.ui.Components.v51;
public final class j4 extends g.p {
    public final l4 f44157c;

    public j4(l4 l4Var) {
        this.f44157c = l4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.f44157c;
        uz uzVar = l4Var.f44208a0;
        j61 j61Var = l4Var.f44212e0;
        if (j61Var == null) {
            return uzVar.J;
        }
        v51 G = j61Var.G(i10 - 1);
        if (G != null && (i11 = G.f27838u) != -1) {
            return i11;
        }
        return uzVar.J;
    }
}
