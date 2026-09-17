package org.telegram.ui;
public final class u71 extends g.p {
    public final w71 f40993c;

    public u71(w71 w71Var) {
        this.f40993c = w71Var;
    }

    @Override
    public final int i(int i10) {
        int i11;
        w71 w71Var = this.f40993c;
        org.telegram.ui.Components.nz nzVar = w71Var.X;
        org.telegram.ui.Components.v51 v51Var = w71Var.f41820d0;
        if (v51Var == null) {
            return nzVar.J;
        }
        org.telegram.ui.Components.h51 G = v51Var.G(i10 - 1);
        if (G != null && (i11 = G.f26631u) != -1) {
            return i11;
        }
        return nzVar.J;
    }
}
