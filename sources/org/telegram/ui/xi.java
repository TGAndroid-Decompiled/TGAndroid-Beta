package org.telegram.ui;

public final class xi extends org.telegram.ui.ActionBar.n1 {

    public final rn f44471o;

    public xi(rn rnVar, vi viVar) {
        super(viVar, -2, -2);
        this.f44471o = rnVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rn rnVar = this.f44471o;
        if (rnVar.M8 != this) {
            return;
        }
        rnVar.M8 = null;
        rnVar.P8 = null;
        rnVar.O8 = null;
        rnVar.f42239v0.R = true;
        if (rnVar.N8) {
            rnVar.g8(false, true, 0.0f);
        } else {
            rnVar.N8 = true;
        }
        ck ckVar = rnVar.U;
        if (ckVar == null || ckVar.getEditField() == null) {
            return;
        }
        rnVar.U.getEditField().setAllowDrawCursor(true);
    }
}
