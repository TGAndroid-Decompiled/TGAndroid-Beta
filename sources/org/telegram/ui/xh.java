package org.telegram.ui;
public final class xh extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.xi0 f53805o;
    public final bn f53806p;

    public xh(bn bnVar, wa waVar, org.telegram.ui.Components.xi0 xi0Var) {
        super(waVar, -2, -2);
        this.f53806p = bnVar;
        this.f53805o = xi0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.xi0 xi0Var = this.f53805o;
        if (xi0Var != null) {
            xi0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f53806p;
        if (bnVar.f45994g9 == this) {
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35481w;
            org.telegram.ui.Components.gc gcVar2 = bnVar.C1;
            if (gcVar == gcVar2 && gcVar2 != null) {
                gcVar2.b();
                bnVar.C1 = null;
            }
            bnVar.f45994g9 = null;
            bnVar.f46059l9 = null;
            bnVar.f46047k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46007h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46007h9 = true;
            }
            rj rjVar = bnVar.f45903a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45903a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
