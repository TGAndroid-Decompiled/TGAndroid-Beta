package org.telegram.ui;
public final class yi extends org.telegram.ui.ActionBar.m1 {
    public final sn f43872o;

    public yi(sn snVar, wi wiVar) {
        super(wiVar, -2, -2);
        this.f43872o = snVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        sn snVar = this.f43872o;
        if (snVar.f41484c9 == this) {
            snVar.f41484c9 = null;
            snVar.f41521f9 = null;
            snVar.f41508e9 = null;
            snVar.f41762z0.R = true;
            if (snVar.f41497d9) {
                snVar.j8(false, true, 0.0f);
            } else {
                snVar.f41497d9 = true;
            }
            gk gkVar = snVar.Y;
            if (gkVar != null && gkVar.getEditField() != null) {
                snVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
