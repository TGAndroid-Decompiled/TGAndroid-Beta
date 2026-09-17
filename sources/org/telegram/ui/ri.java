package org.telegram.ui;
public final class ri extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.fk0 f40180o;
    public final co f40181p;

    public ri(co coVar, db dbVar, org.telegram.ui.Components.fk0 fk0Var) {
        super(dbVar, -2, -2);
        this.f40181p = coVar;
        this.f40180o = fk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.fk0 fk0Var = this.f40180o;
        if (fk0Var != null) {
            fk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        co coVar = this.f40181p;
        if (coVar.Q8 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29672w;
            org.telegram.ui.Components.qc qcVar2 = coVar.f35349n1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                coVar.f35349n1 = null;
            }
            coVar.Q8 = null;
            coVar.T8 = null;
            coVar.S8 = null;
            coVar.f35499z0.R = true;
            if (coVar.R8) {
                coVar.g8(false, true, 0.0f);
            } else {
                coVar.R8 = true;
            }
            mk mkVar = coVar.Y;
            if (mkVar != null && mkVar.getEditField() != null) {
                coVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
