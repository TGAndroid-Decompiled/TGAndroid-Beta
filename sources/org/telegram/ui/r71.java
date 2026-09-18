package org.telegram.ui;
public final class r71 extends g.p {
    public final t71 f36983c;

    public r71(t71 t71Var) {
        this.f36983c = t71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        t71 t71Var = this.f36983c;
        org.telegram.ui.Components.nz nzVar = t71Var.X;
        org.telegram.ui.Components.l61 l61Var = t71Var.f37609d0;
        if (l61Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.x51 G = l61Var.G(i10 - 1);
        if (G != null && (i11 = G.f30257u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
