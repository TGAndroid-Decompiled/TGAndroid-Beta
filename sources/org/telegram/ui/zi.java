package org.telegram.ui;
public final class zi extends org.telegram.ui.ActionBar.o1 {
    public final un f46301o;

    public zi(un unVar, xi xiVar) {
        super(xiVar, -2, -2);
        this.f46301o = unVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        un unVar = this.f46301o;
        if (unVar.f44213c9 == this) {
            unVar.f44213c9 = null;
            unVar.f44251f9 = null;
            unVar.f44239e9 = null;
            unVar.f44493z0.R = true;
            if (unVar.f44226d9) {
                unVar.n8(false, true, 0.0f);
            } else {
                unVar.f44226d9 = true;
            }
            hk hkVar = unVar.Y;
            if (hkVar != null && hkVar.getEditField() != null) {
                unVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
