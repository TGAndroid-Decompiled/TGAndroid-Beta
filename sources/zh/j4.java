package zh;

import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;
public final class j4 extends g.o {
    public final l4 f53135c;

    public j4(l4 l4Var) {
        this.f53135c = l4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.f53135c;
        vz vzVar = l4Var.f53160a0;
        k71 k71Var = l4Var.f53166g0;
        if (k71Var == null) {
            return vzVar.J;
        }
        u61 G = k71Var.G(i10 - 1);
        if (G != null && (i11 = G.f33258u) != -1) {
            return i11;
        }
        return vzVar.J;
    }
}
