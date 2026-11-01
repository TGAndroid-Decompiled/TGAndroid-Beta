package org.telegram.ui;
public final class ti extends org.telegram.ui.ActionBar.k1 {
    public final org.telegram.ui.Components.nj0 f41645o;
    public final un f41646p;

    public ti(un unVar, cb cbVar, org.telegram.ui.Components.nj0 nj0Var) {
        super(cbVar, -2, -2);
        this.f41646p = unVar;
        this.f41645o = nj0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.nj0 nj0Var = this.f41645o;
        if (nj0Var != null) {
            nj0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        un unVar = this.f41646p;
        if (unVar.f42051e9 == this) {
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32194w;
            org.telegram.ui.Components.wb wbVar2 = unVar.B1;
            if (wbVar == wbVar2 && wbVar2 != null) {
                wbVar2.b();
                unVar.B1 = null;
            }
            unVar.f42051e9 = null;
            unVar.f42087h9 = null;
            unVar.f42076g9 = null;
            unVar.B0.R = true;
            if (unVar.f42063f9) {
                unVar.s8(false, true, 0.0f);
            } else {
                unVar.f42063f9 = true;
            }
            mk mkVar = unVar.Z;
            if (mkVar != null && mkVar.getEditField() != null) {
                unVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
