package org.telegram.ui;
public final class vi extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.gl0 f41015o;
    public final fo f41016p;

    public vi(fo foVar, ib ibVar, org.telegram.ui.Components.gl0 gl0Var) {
        super(ibVar, -2, -2);
        this.f41016p = foVar;
        this.f41015o = gl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.gl0 gl0Var = this.f41015o;
        if (gl0Var != null) {
            gl0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        fo foVar = this.f41016p;
        if (foVar.Q8 == this) {
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f29095w;
            org.telegram.ui.Components.sc scVar2 = foVar.f36034n1;
            if (scVar == scVar2 && scVar2 != null) {
                scVar2.b();
                foVar.f36034n1 = null;
            }
            foVar.Q8 = null;
            foVar.T8 = null;
            foVar.S8 = null;
            foVar.f36185z0.R = true;
            if (foVar.R8) {
                foVar.j8(false, true, 0.0f);
            } else {
                foVar.R8 = true;
            }
            sk skVar = foVar.Y;
            if (skVar != null && skVar.getEditField() != null) {
                foVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
