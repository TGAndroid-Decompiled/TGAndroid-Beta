package org.telegram.ui;
public final class xa extends org.telegram.ui.ActionBar.g1 {
    public final lb f53898o;

    public xa(lb lbVar, wa waVar) {
        super(waVar, -2, -2);
        this.f53898o = lbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        lb lbVar = this.f53898o;
        if (lbVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.fc.e();
        lbVar.G0 = null;
    }
}
