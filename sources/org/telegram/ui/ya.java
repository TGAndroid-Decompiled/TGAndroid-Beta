package org.telegram.ui;
public final class ya extends org.telegram.ui.ActionBar.o1 {
    public final pb f44803o;

    public ya(pb pbVar, xa xaVar) {
        super(xaVar, -2, -2);
        this.f44803o = pbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        pb pbVar = this.f44803o;
        if (pbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.gc.e();
        pbVar.F0 = null;
    }
}
