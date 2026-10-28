package zh;

import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;
public final class x0 extends g.o {
    public final p1 f53378c;

    public x0(p1 p1Var) {
        this.f53378c = p1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.f53378c;
        vz vzVar = p1Var.f53256j0;
        k71 k71Var = p1Var.Y;
        if (k71Var != null && i10 != 0) {
            u61 G = k71Var.G(i10 - 1);
            if (G != null && (i11 = G.f33258u) != -1) {
                return i11;
            }
            return vzVar.J;
        }
        return vzVar.J;
    }
}
