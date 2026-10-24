package org.telegram.ui;
public final class yi extends org.telegram.ui.ActionBar.m1 {
    public final sn f43873o;

    public yi(sn snVar, wi wiVar) {
        super(wiVar, -2, -2);
        this.f43873o = snVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        sn snVar = this.f43873o;
        if (snVar.f41481c9 == this) {
            snVar.f41481c9 = null;
            snVar.f41518f9 = null;
            snVar.f41505e9 = null;
            snVar.f41759z0.R = true;
            if (snVar.f41494d9) {
                snVar.j8(false, true, 0.0f);
            } else {
                snVar.f41494d9 = true;
            }
            gk gkVar = snVar.Y;
            if (gkVar != null && gkVar.getEditField() != null) {
                snVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
