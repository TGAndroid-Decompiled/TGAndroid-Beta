package org.telegram.ui;
public final class yh extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.xi0 f54201o;
    public final bn f54202p;

    public yh(bn bnVar, wa waVar, org.telegram.ui.Components.xi0 xi0Var) {
        super(waVar, -2, -2);
        this.f54202p = bnVar;
        this.f54201o = xi0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.xi0 xi0Var = this.f54201o;
        if (xi0Var != null) {
            xi0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f54202p;
        if (bnVar.f46037g9 == this) {
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35500w;
            org.telegram.ui.Components.gc gcVar2 = bnVar.C1;
            if (gcVar == gcVar2 && gcVar2 != null) {
                gcVar2.b();
                bnVar.C1 = null;
            }
            bnVar.f46037g9 = null;
            bnVar.f46102l9 = null;
            bnVar.f46090k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46050h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46050h9 = true;
            }
            rj rjVar = bnVar.f45946a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45946a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
