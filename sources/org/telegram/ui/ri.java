package org.telegram.ui;
public final class ri extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.kl0 f41432o;
    public final zn f41433p;

    public ri(zn znVar, eb ebVar, org.telegram.ui.Components.kl0 kl0Var) {
        super(ebVar, -2, -2);
        this.f41433p = znVar;
        this.f41432o = kl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.kl0 kl0Var = this.f41432o;
        if (kl0Var != null) {
            kl0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f41433p;
        if (znVar.Q8 == this) {
            org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.f31122w;
            org.telegram.ui.Components.tc tcVar2 = znVar.f44862n1;
            if (tcVar == tcVar2 && tcVar2 != null) {
                tcVar2.b();
                znVar.f44862n1 = null;
            }
            znVar.Q8 = null;
            znVar.T8 = null;
            znVar.S8 = null;
            znVar.f45012z0.R = true;
            if (znVar.R8) {
                znVar.j8(false, true, 0.0f);
            } else {
                znVar.R8 = true;
            }
            ok okVar = znVar.Y;
            if (okVar != null && okVar.getEditField() != null) {
                znVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
