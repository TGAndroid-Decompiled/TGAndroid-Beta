package org.telegram.ui;
public final class ri extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.ml0 f41447o;
    public final zn f41448p;

    public ri(zn znVar, db dbVar, org.telegram.ui.Components.ml0 ml0Var) {
        super(dbVar, -2, -2);
        this.f41448p = znVar;
        this.f41447o = ml0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.ml0 ml0Var = this.f41447o;
        if (ml0Var != null) {
            ml0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f41448p;
        if (znVar.Q8 == this) {
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30703w;
            org.telegram.ui.Components.sc scVar2 = znVar.f44863n1;
            if (scVar == scVar2 && scVar2 != null) {
                scVar2.b();
                znVar.f44863n1 = null;
            }
            znVar.Q8 = null;
            znVar.T8 = null;
            znVar.S8 = null;
            znVar.f45013z0.R = true;
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
