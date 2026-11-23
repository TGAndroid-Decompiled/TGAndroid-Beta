package org.telegram.ui;
public final class yh extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.xi0 f54205o;
    public final bn f54206p;

    public yh(bn bnVar, wa waVar, org.telegram.ui.Components.xi0 xi0Var) {
        super(waVar, -2, -2);
        this.f54206p = bnVar;
        this.f54205o = xi0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.xi0 xi0Var = this.f54205o;
        if (xi0Var != null) {
            xi0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f54206p;
        if (bnVar.f46041g9 == this) {
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35519w;
            org.telegram.ui.Components.gc gcVar2 = bnVar.C1;
            if (gcVar == gcVar2 && gcVar2 != null) {
                gcVar2.b();
                bnVar.C1 = null;
            }
            bnVar.f46041g9 = null;
            bnVar.f46106l9 = null;
            bnVar.f46094k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46054h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46054h9 = true;
            }
            rj rjVar = bnVar.f45950a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45950a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
