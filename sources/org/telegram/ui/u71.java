package org.telegram.ui;
public final class u71 extends g.p {
    public final w71 f37989c;

    public u71(w71 w71Var) {
        this.f37989c = w71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w71 w71Var = this.f37989c;
        org.telegram.ui.Components.nz nzVar = w71Var.X;
        org.telegram.ui.Components.k61 k61Var = w71Var.f38693d0;
        if (k61Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.w51 G = k61Var.G(i10 - 1);
        if (G != null && (i11 = G.f29957u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
