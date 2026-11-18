package org.telegram.ui;
public final class xh extends org.telegram.ui.ActionBar.h1 {
    public final org.telegram.ui.Components.vi0 f53855o;
    public final bn f53856p;

    public xh(bn bnVar, wa waVar, org.telegram.ui.Components.vi0 vi0Var) {
        super(waVar, -2, -2);
        this.f53856p = bnVar;
        this.f53855o = vi0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.vi0 vi0Var = this.f53855o;
        if (vi0Var != null) {
            vi0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        bn bnVar = this.f53856p;
        if (bnVar.f46023g9 == this) {
            org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f35453w;
            org.telegram.ui.Components.gc gcVar2 = bnVar.C1;
            if (gcVar == gcVar2 && gcVar2 != null) {
                gcVar2.b();
                bnVar.C1 = null;
            }
            bnVar.f46023g9 = null;
            bnVar.f46088l9 = null;
            bnVar.f46076k9 = null;
            bnVar.C0.R = true;
            if (bnVar.f46036h9) {
                bnVar.x8(false, true, 0.0f);
            } else {
                bnVar.f46036h9 = true;
            }
            rj rjVar = bnVar.f45932a0;
            if (rjVar != null && rjVar.getEditField() != null) {
                bnVar.f45932a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
