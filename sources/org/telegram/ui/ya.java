package org.telegram.ui;
public final class ya extends org.telegram.ui.ActionBar.g1 {
    public final mb f52063o;

    public ya(mb mbVar, xa xaVar) {
        super(xaVar, -2, -2);
        this.f52063o = mbVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        mb mbVar = this.f52063o;
        if (mbVar.F0 != this) {
            return;
        }
        org.telegram.ui.Components.cc.e();
        mbVar.F0 = null;
    }
}
