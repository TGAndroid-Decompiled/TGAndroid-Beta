package org.telegram.ui;
public final class ri extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.fk0 f40179o;
    public final co f40180p;

    public ri(co coVar, db dbVar, org.telegram.ui.Components.fk0 fk0Var) {
        super(dbVar, -2, -2);
        this.f40180p = coVar;
        this.f40179o = fk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.fk0 fk0Var = this.f40179o;
        if (fk0Var != null) {
            fk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        co coVar = this.f40180p;
        if (coVar.Q8 == this) {
            org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29671w;
            org.telegram.ui.Components.qc qcVar2 = coVar.f35348n1;
            if (qcVar == qcVar2 && qcVar2 != null) {
                qcVar2.b();
                coVar.f35348n1 = null;
            }
            coVar.Q8 = null;
            coVar.T8 = null;
            coVar.S8 = null;
            coVar.f35498z0.R = true;
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
