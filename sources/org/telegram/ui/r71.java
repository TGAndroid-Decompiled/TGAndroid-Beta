package org.telegram.ui;
public final class r71 extends g.p {
    public final t71 f37038c;

    public r71(t71 t71Var) {
        this.f37038c = t71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        t71 t71Var = this.f37038c;
        org.telegram.ui.Components.nz nzVar = t71Var.X;
        org.telegram.ui.Components.w51 w51Var = t71Var.f37584d0;
        if (w51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.i51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f24903u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
