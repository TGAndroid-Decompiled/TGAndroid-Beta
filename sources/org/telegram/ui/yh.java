package org.telegram.ui;
public final class yh extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.mi0 f53509o;
    public final an f53510p;

    public yh(an anVar, wa waVar, org.telegram.ui.Components.mi0 mi0Var) {
        super(waVar, -2, -2);
        this.f53510p = anVar;
        this.f53509o = mi0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.mi0 mi0Var = this.f53509o;
        if (mi0Var != null) {
            mi0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        an anVar = this.f53510p;
        if (anVar.f45197f9 == this) {
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41635w;
            org.telegram.ui.Components.xb xbVar2 = anVar.C1;
            if (xbVar == xbVar2 && xbVar2 != null) {
                xbVar2.b();
                anVar.C1 = null;
            }
            anVar.f45197f9 = null;
            anVar.f45262k9 = null;
            anVar.f45248j9 = null;
            anVar.C0.R = true;
            if (anVar.f45209g9) {
                anVar.x8(false, true, 0.0f);
            } else {
                anVar.f45209g9 = true;
            }
            qj qjVar = anVar.f45118a0;
            if (qjVar != null && qjVar.getEditField() != null) {
                anVar.f45118a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
