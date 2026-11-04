package org.telegram.ui;
public final class wa extends org.telegram.ui.ActionBar.f1 {
    public final kb f50758o;

    public wa(kb kbVar, va vaVar) {
        super(vaVar, -2, -2);
        this.f50758o = kbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        kb kbVar = this.f50758o;
        if (kbVar.G0 != this) {
            return;
        }
        org.telegram.ui.Components.ac.e();
        kbVar.G0 = null;
    }
}
