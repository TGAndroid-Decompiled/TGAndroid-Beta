package org.telegram.ui;
public final class ri extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.ll0 f41478o;
    public final zn f41479p;

    public ri(zn znVar, eb ebVar, org.telegram.ui.Components.ll0 ll0Var) {
        super(ebVar, -2, -2);
        this.f41479p = znVar;
        this.f41478o = ll0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.ll0 ll0Var = this.f41478o;
        if (ll0Var != null) {
            ll0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f41479p;
        if (znVar.Q8 == this) {
            org.telegram.ui.Components.tc tcVar = org.telegram.ui.Components.tc.f31088w;
            org.telegram.ui.Components.tc tcVar2 = znVar.f44908n1;
            if (tcVar == tcVar2 && tcVar2 != null) {
                tcVar2.b();
                znVar.f44908n1 = null;
            }
            znVar.Q8 = null;
            znVar.T8 = null;
            znVar.S8 = null;
            znVar.f45058z0.R = true;
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
