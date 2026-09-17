package org.telegram.ui;
public final class t71 extends g.p {
    public final v71 f37676c;

    public t71(v71 v71Var) {
        this.f37676c = v71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        v71 v71Var = this.f37676c;
        org.telegram.ui.Components.nz nzVar = v71Var.X;
        org.telegram.ui.Components.x51 x51Var = v71Var.f38323d0;
        if (x51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.j51 G = x51Var.G(i10 - 1);
        if (G != null && (i11 = G.f25133u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
