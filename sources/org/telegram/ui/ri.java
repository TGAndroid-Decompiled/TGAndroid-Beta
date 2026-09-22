package org.telegram.ui;
public final class ri extends org.telegram.ui.ActionBar.n1 {
    public final org.telegram.ui.Components.sk0 f37196o;
    public final zn f37197p;

    public ri(zn znVar, eb ebVar, org.telegram.ui.Components.sk0 sk0Var) {
        super(ebVar, -2, -2);
        this.f37197p = znVar;
        this.f37196o = sk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.sk0 sk0Var = this.f37196o;
        if (sk0Var != null) {
            sk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        zn znVar = this.f37197p;
        if (znVar.Q8 == this) {
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f27304w;
            org.telegram.ui.Components.pc pcVar2 = znVar.f40426n1;
            if (pcVar == pcVar2 && pcVar2 != null) {
                pcVar2.b();
                znVar.f40426n1 = null;
            }
            znVar.Q8 = null;
            znVar.T8 = null;
            znVar.S8 = null;
            znVar.f40576z0.R = true;
            if (znVar.R8) {
                znVar.g8(false, true, 0.0f);
            } else {
                znVar.R8 = true;
            }
            mk mkVar = znVar.Y;
            if (mkVar != null && mkVar.getEditField() != null) {
                znVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
