package org.telegram.ui;
public final class yi extends org.telegram.ui.ActionBar.m1 {
    public final qn f43507o;

    public yi(qn qnVar, wi wiVar) {
        super(wiVar, -2, -2);
        this.f43507o = qnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qn qnVar = this.f43507o;
        if (qnVar.Q8 == this) {
            qnVar.Q8 = null;
            qnVar.T8 = null;
            qnVar.S8 = null;
            qnVar.f40929z0.R = true;
            if (qnVar.R8) {
                qnVar.j8(false, true, 0.0f);
            } else {
                qnVar.R8 = true;
            }
            fk fkVar = qnVar.Y;
            if (fkVar != null && fkVar.getEditField() != null) {
                qnVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
