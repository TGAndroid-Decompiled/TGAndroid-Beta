package org.telegram.ui;
public final class xh extends org.telegram.ui.ActionBar.h1 {
    public final org.telegram.ui.Components.vi0 f53830o;
    public final bn f53831p;

    public xh(bn bnVar, wa waVar, org.telegram.ui.Components.vi0 vi0Var) {
        super(waVar, -2, -2);
        this.f53831p = bnVar;
        this.f53830o = vi0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.vi0 vi0Var = this.f53830o;
        if (vi0Var != null) {
            vi0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f53831p;
        if (bnVar.f46014g9 == this) {
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
            org.telegram.ui.Components.gc gcVar2 = bnVar.C1;
            if (gcVar == gcVar2 && gcVar2 != null) {
                gcVar2.b();
                bnVar.C1 = null;
            }
            bnVar.f46014g9 = null;
            bnVar.f46079l9 = null;
            bnVar.f46067k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46027h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46027h9 = true;
            }
            rj rjVar = bnVar.f45923a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45923a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
