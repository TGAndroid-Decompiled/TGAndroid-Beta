package org.telegram.ui;
public final class ys0 implements org.telegram.ui.ActionBar.q1 {
    public final int f53622a;
    public final PrivacyControlActivity f53623b;

    public ys0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f53622a = i7;
        this.f53623b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f53622a) {
            case 0:
                this.f53623b.K0();
                return;
            case 1:
                this.f53623b.finishFragment();
                return;
            default:
                this.f53623b.finishFragment();
                return;
        }
    }
}
