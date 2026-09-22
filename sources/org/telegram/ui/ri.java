package org.telegram.ui;
public final class ri extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.fk0 f37138o;
    public final bo f37139p;

    public ri(bo boVar, db dbVar, org.telegram.ui.Components.fk0 fk0Var) {
        super(dbVar, -2, -2);
        this.f37139p = boVar;
        this.f37138o = fk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.fk0 fk0Var = this.f37138o;
        if (fk0Var != null) {
            fk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        bo boVar = this.f37139p;
        if (boVar.Q8 == this) {
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26744w;
            org.telegram.ui.Components.oc ocVar2 = boVar.f32394n1;
            if (ocVar == ocVar2 && ocVar2 != null) {
                ocVar2.b();
                boVar.f32394n1 = null;
            }
            boVar.Q8 = null;
            boVar.T8 = null;
            boVar.S8 = null;
            boVar.f32544z0.R = true;
            if (boVar.R8) {
                boVar.g8(false, true, 0.0f);
            } else {
                boVar.R8 = true;
            }
            mk mkVar = boVar.Y;
            if (mkVar != null && mkVar.getEditField() != null) {
                boVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
