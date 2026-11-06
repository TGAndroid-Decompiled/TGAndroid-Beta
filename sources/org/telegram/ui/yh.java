package org.telegram.ui;
public final class yh extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.ii0 f52239o;
    public final an f52240p;

    public yh(an anVar, xa xaVar, org.telegram.ui.Components.ii0 ii0Var) {
        super(xaVar, -2, -2);
        this.f52240p = anVar;
        this.f52239o = ii0Var;
    }

    @Override
    public final void d(boolean z9) {
        super.d(z9);
        org.telegram.ui.Components.ii0 ii0Var = this.f52239o;
        if (ii0Var != null) {
            ii0Var.d(z9);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        an anVar = this.f52240p;
        if (anVar.f43782e9 == this) {
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32519w;
            org.telegram.ui.Components.cc ccVar2 = anVar.B1;
            if (ccVar == ccVar2 && ccVar2 != null) {
                ccVar2.b();
                anVar.B1 = null;
            }
            anVar.f43782e9 = null;
            anVar.f43821h9 = null;
            anVar.f43808g9 = null;
            anVar.B0.R = true;
            if (anVar.f43796f9) {
                anVar.v8(false, true, 0.0f);
            } else {
                anVar.f43796f9 = true;
            }
            qj qjVar = anVar.Z;
            if (qjVar != null && qjVar.getEditField() != null) {
                anVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
