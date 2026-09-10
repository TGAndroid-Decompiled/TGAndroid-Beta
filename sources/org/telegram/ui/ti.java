package org.telegram.ui;
public final class ti extends org.telegram.ui.ActionBar.p1 {
    public final org.telegram.ui.Components.pk0 f36946o;
    public final eo f36947p;

    public ti(eo eoVar, fb fbVar, org.telegram.ui.Components.pk0 pk0Var) {
        super(fbVar, -2, -2);
        this.f36947p = eoVar;
        this.f36946o = pk0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(true);
        org.telegram.ui.Components.pk0 pk0Var = this.f36946o;
        if (pk0Var != null) {
            pk0Var.d();
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        eo eoVar = this.f36947p;
        if (eoVar.Q8 == this) {
            org.telegram.ui.Components.pc pcVar = org.telegram.ui.Components.pc.f26074w;
            org.telegram.ui.Components.pc pcVar2 = eoVar.f32417n1;
            if (pcVar == pcVar2 && pcVar2 != null) {
                pcVar2.b();
                eoVar.f32417n1 = null;
            }
            eoVar.Q8 = null;
            eoVar.T8 = null;
            eoVar.S8 = null;
            eoVar.f32567z0.R = true;
            if (eoVar.R8) {
                eoVar.g8(false, true, 0.0f);
            } else {
                eoVar.R8 = true;
            }
            ok okVar = eoVar.Y;
            if (okVar != null && okVar.getEditField() != null) {
                eoVar.Y.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
