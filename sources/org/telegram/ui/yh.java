package org.telegram.ui;
public final class yh extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.ii0 f52217o;
    public final an f52218p;

    public yh(an anVar, xa xaVar, org.telegram.ui.Components.ii0 ii0Var) {
        super(xaVar, -2, -2);
        this.f52218p = anVar;
        this.f52217o = ii0Var;
    }

    @Override
    public final void d(boolean z9) {
        super.d(z9);
        org.telegram.ui.Components.ii0 ii0Var = this.f52217o;
        if (ii0Var != null) {
            ii0Var.d(z9);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        an anVar = this.f52218p;
        if (anVar.f43787e9 == this) {
            org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.f32537w;
            org.telegram.ui.Components.cc ccVar2 = anVar.B1;
            if (ccVar == ccVar2 && ccVar2 != null) {
                ccVar2.b();
                anVar.B1 = null;
            }
            anVar.f43787e9 = null;
            anVar.f43826h9 = null;
            anVar.f43813g9 = null;
            anVar.B0.R = true;
            if (anVar.f43801f9) {
                anVar.v8(false, true, 0.0f);
            } else {
                anVar.f43801f9 = true;
            }
            qj qjVar = anVar.Z;
            if (qjVar != null && qjVar.getEditField() != null) {
                anVar.Z.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
