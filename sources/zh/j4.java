package zh;

import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;
public final class j4 extends g.o {
    public final l4 f53077c;

    public j4(l4 l4Var) {
        this.f53077c = l4Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        l4 l4Var = this.f53077c;
        vz vzVar = l4Var.f53102a0;
        j71 j71Var = l4Var.f53108g0;
        if (j71Var == null) {
            return vzVar.J;
        }
        t61 G = j71Var.G(i10 - 1);
        if (G != null && (i11 = G.f32884u) != -1) {
            return i11;
        }
        return vzVar.J;
    }
}
