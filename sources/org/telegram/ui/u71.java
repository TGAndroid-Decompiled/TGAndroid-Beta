package org.telegram.ui;
public final class u71 extends g.p {
    public final w71 f37990c;

    public u71(w71 w71Var) {
        this.f37990c = w71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w71 w71Var = this.f37990c;
        org.telegram.ui.Components.nz nzVar = w71Var.X;
        org.telegram.ui.Components.m61 m61Var = w71Var.f38714d0;
        if (m61Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.y51 G = m61Var.G(i10 - 1);
        if (G != null && (i11 = G.f30527u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
