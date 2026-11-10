package org.telegram.ui;
public final class ya extends org.telegram.ui.ActionBar.g1 {
    public final mb f51981o;

    public ya(mb mbVar, xa xaVar) {
        super(xaVar, -2, -2);
        this.f51981o = mbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        mb mbVar = this.f51981o;
        if (mbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.bc.e();
        mbVar.F0 = null;
    }
}
