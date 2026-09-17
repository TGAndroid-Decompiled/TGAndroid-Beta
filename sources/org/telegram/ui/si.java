package org.telegram.ui;
public final class si extends org.telegram.ui.ActionBar.o1 {
    public final org.telegram.ui.Components.gk0 f37500o;
    public final bo f37501p;

    public si(bo boVar, fb fbVar, org.telegram.ui.Components.gk0 gk0Var) {
        super(fbVar, -2, -2);
        this.f37501p = boVar;
        this.f37500o = gk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.gk0 gk0Var = this.f37500o;
        if (gk0Var != null) {
            gk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        bo boVar = this.f37501p;
        if (boVar.Q8 == this) {
            org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f26695w;
            org.telegram.ui.Components.oc ocVar2 = boVar.f32377n1;
            if (ocVar == ocVar2 && ocVar2 != null) {
                ocVar2.b();
                boVar.f32377n1 = null;
            }
            boVar.Q8 = null;
            boVar.T8 = null;
            boVar.S8 = null;
            boVar.f32527z0.R = true;
            if (boVar.R8) {
                boVar.g8(false, true, 0.0f);
            } else {
                boVar.R8 = true;
            }
            nk nkVar = boVar.Y;
            if (nkVar != null && nkVar.getEditField() != null) {
                boVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
