package org.telegram.ui;
public final class yh extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.xi0 f54378o;
    public final bn f54379p;

    public yh(bn bnVar, wa waVar, org.telegram.ui.Components.xi0 xi0Var) {
        super(waVar, -2, -2);
        this.f54379p = bnVar;
        this.f54378o = xi0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.xi0 xi0Var = this.f54378o;
        if (xi0Var != null) {
            xi0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f54379p;
        if (bnVar.f46209g9 == this) {
            org.telegram.ui.Components.fc fcVar = org.telegram.ui.Components.fc.f35083w;
            org.telegram.ui.Components.fc fcVar2 = bnVar.C1;
            if (fcVar == fcVar2 && fcVar2 != null) {
                fcVar2.b();
                bnVar.C1 = null;
            }
            bnVar.f46209g9 = null;
            bnVar.f46274l9 = null;
            bnVar.f46262k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46222h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46222h9 = true;
            }
            rj rjVar = bnVar.f46118a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f46118a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
