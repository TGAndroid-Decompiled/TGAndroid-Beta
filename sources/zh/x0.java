package zh;

import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.vz;
public final class x0 extends g.o {
    public final p1 f53320c;

    public x0(p1 p1Var) {
        this.f53320c = p1Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        p1 p1Var = this.f53320c;
        vz vzVar = p1Var.f53198j0;
        j71 j71Var = p1Var.Y;
        if (j71Var != null && i10 != 0) {
            t61 G = j71Var.G(i10 - 1);
            if (G != null && (i11 = G.f32884u) != -1) {
                return i11;
            }
            return vzVar.J;
        }
        return vzVar.J;
    }
}
