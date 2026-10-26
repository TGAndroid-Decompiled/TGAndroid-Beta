package org.telegram.ui;
public final class zi extends org.telegram.ui.ActionBar.o1 {
    public final un f46304o;

    public zi(un unVar, xi xiVar) {
        super(xiVar, -2, -2);
        this.f46304o = unVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        un unVar = this.f46304o;
        if (unVar.f44216c9 == this) {
            unVar.f44216c9 = null;
            unVar.f44254f9 = null;
            unVar.f44242e9 = null;
            unVar.f44496z0.R = true;
            if (unVar.f44229d9) {
                unVar.n8(false, true, 0.0f);
            } else {
                unVar.f44229d9 = true;
            }
            hk hkVar = unVar.Y;
            if (hkVar != null && hkVar.getEditField() != null) {
                unVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
