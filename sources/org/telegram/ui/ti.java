package org.telegram.ui;
public final class ti extends org.telegram.ui.ActionBar.k1 {
    public final org.telegram.ui.Components.mj0 f41846o;
    public final un f41847p;

    public ti(un unVar, cb cbVar, org.telegram.ui.Components.mj0 mj0Var) {
        super(cbVar, -2, -2);
        this.f41847p = unVar;
        this.f41846o = mj0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.mj0 mj0Var = this.f41846o;
        if (mj0Var != null) {
            mj0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        un unVar = this.f41847p;
        if (unVar.f42240e9 == this) {
            org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32128w;
            org.telegram.ui.Components.wb wbVar2 = unVar.B1;
            if (wbVar == wbVar2 && wbVar2 != null) {
                wbVar2.b();
                unVar.B1 = null;
            }
            unVar.f42240e9 = null;
            unVar.f42276h9 = null;
            unVar.f42265g9 = null;
            unVar.B0.R = true;
            if (unVar.f42252f9) {
                unVar.o8(false, true, 0.0f);
            } else {
                unVar.f42252f9 = true;
            }
            mk mkVar = unVar.Z;
            if (mkVar != null && mkVar.getEditField() != null) {
                unVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
