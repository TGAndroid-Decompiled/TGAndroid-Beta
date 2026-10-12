package org.telegram.ui;
public final class vi extends org.telegram.ui.ActionBar.m1 {
    public final org.telegram.ui.Components.nl0 f42804o;
    public final eo f42805p;

    public vi(eo eoVar, hb hbVar, org.telegram.ui.Components.nl0 nl0Var) {
        super(hbVar, -2, -2);
        this.f42805p = eoVar;
        this.f42804o = nl0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.nl0 nl0Var = this.f42804o;
        if (nl0Var != null) {
            nl0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        eo eoVar = this.f42805p;
        if (eoVar.Q8 == this) {
            org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30528w;
            org.telegram.ui.Components.sc scVar2 = eoVar.f37357n1;
            if (scVar == scVar2 && scVar2 != null) {
                scVar2.b();
                eoVar.f37357n1 = null;
            }
            eoVar.Q8 = null;
            eoVar.T8 = null;
            eoVar.S8 = null;
            eoVar.f37507z0.R = true;
            if (eoVar.R8) {
                eoVar.j8(false, true, 0.0f);
            } else {
                eoVar.R8 = true;
            }
            sk skVar = eoVar.Y;
            if (skVar != null && skVar.getEditField() != null) {
                eoVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
