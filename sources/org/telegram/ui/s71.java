package org.telegram.ui;
public final class s71 extends g.p {
    public final u71 f37291c;

    public s71(u71 u71Var) {
        this.f37291c = u71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        u71 u71Var = this.f37291c;
        org.telegram.ui.Components.nz nzVar = u71Var.X;
        org.telegram.ui.Components.w51 w51Var = u71Var.f37838d0;
        if (w51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.i51 G = w51Var.G(i10 - 1);
        if (G != null && (i11 = G.f24909u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
