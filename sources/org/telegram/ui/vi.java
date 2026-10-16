package org.telegram.ui;
public final class vi extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.gl0 f40717o;
    public final fo f40718p;

    public vi(fo foVar, ib ibVar, org.telegram.ui.Components.gl0 gl0Var) {
        super(ibVar, -2, -2);
        this.f40718p = foVar;
        this.f40717o = gl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.gl0 gl0Var = this.f40717o;
        if (gl0Var != null) {
            gl0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        fo foVar = this.f40718p;
        if (foVar.Q8 == this) {
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f28798w;
            org.telegram.ui.Components.sc scVar2 = foVar.f35735n1;
            if (scVar == scVar2 && scVar2 != null) {
                scVar2.b();
                foVar.f35735n1 = null;
            }
            foVar.Q8 = null;
            foVar.T8 = null;
            foVar.S8 = null;
            foVar.f35886z0.R = true;
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
