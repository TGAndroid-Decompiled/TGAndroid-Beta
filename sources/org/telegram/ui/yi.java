package org.telegram.ui;
public final class yi extends org.telegram.ui.ActionBar.o1 {
    public final tn f44895o;

    public yi(tn tnVar, wi wiVar) {
        super(wiVar, -2, -2);
        this.f44895o = tnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        tn tnVar = this.f44895o;
        if (tnVar.M8 == this) {
            tnVar.M8 = null;
            tnVar.P8 = null;
            tnVar.O8 = null;
            tnVar.f42999v0.R = true;
            if (tnVar.N8) {
                tnVar.g8(false, true, 0.0f);
            } else {
                tnVar.N8 = true;
            }
            dk dkVar = tnVar.U;
            if (dkVar != null && dkVar.getEditField() != null) {
                tnVar.U.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
