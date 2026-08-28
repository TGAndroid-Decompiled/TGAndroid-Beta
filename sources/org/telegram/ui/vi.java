package org.telegram.ui;
public final class vi extends org.telegram.ui.ActionBar.o1 {
    public final qn f43497o;

    public vi(qn qnVar, ti tiVar) {
        super(tiVar, -2, -2);
        this.f43497o = qnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qn qnVar = this.f43497o;
        if (qnVar.M8 == this) {
            qnVar.M8 = null;
            qnVar.P8 = null;
            qnVar.O8 = null;
            qnVar.f42103v0.R = true;
            if (qnVar.N8) {
                qnVar.g8(false, true, 0.0f);
            } else {
                qnVar.N8 = true;
            }
            ak akVar = qnVar.U;
            if (akVar != null && akVar.getEditField() != null) {
                qnVar.U.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
