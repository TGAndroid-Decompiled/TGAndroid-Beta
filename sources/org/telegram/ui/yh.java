package org.telegram.ui;
public final class yh extends org.telegram.ui.ActionBar.g1 {
    public final org.telegram.ui.Components.mi0 f53513o;
    public final an f53514p;

    public yh(an anVar, wa waVar, org.telegram.ui.Components.mi0 mi0Var) {
        super(waVar, -2, -2);
        this.f53514p = anVar;
        this.f53513o = mi0Var;
    }

    @Override
    public final void d(boolean z10) {
        super.d(z10);
        org.telegram.ui.Components.mi0 mi0Var = this.f53513o;
        if (mi0Var != null) {
            mi0Var.d(z10);
        }
    }

    @Override
    public final void dismiss() {
        d(true);
        an anVar = this.f53514p;
        if (anVar.f45196f9 == this) {
            org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.f41627w;
            org.telegram.ui.Components.xb xbVar2 = anVar.C1;
            if (xbVar == xbVar2 && xbVar2 != null) {
                xbVar2.b();
                anVar.C1 = null;
            }
            anVar.f45196f9 = null;
            anVar.f45261k9 = null;
            anVar.f45247j9 = null;
            anVar.C0.R = true;
            if (anVar.f45208g9) {
                anVar.x8(false, true, 0.0f);
            } else {
                anVar.f45208g9 = true;
            }
            qj qjVar = anVar.f45117a0;
            if (qjVar != null && qjVar.getEditField() != null) {
                anVar.f45117a0.getEditField().setAllowDrawCursor(true);
            }
        }
    }
}
