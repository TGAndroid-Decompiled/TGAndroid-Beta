package org.telegram.ui;
public final class xa extends org.telegram.ui.ActionBar.h1 {
    public final lb f53756o;

    public xa(lb lbVar, wa waVar) {
        super(waVar, -2, -2);
        this.f53756o = lbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        lb lbVar = this.f53756o;
        if (lbVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.gc.e();
        lbVar.G0 = null;
    }
}
