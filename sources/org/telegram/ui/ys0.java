package org.telegram.ui;
public final class ys0 implements org.telegram.ui.ActionBar.q1 {
    public final int f53587a;
    public final PrivacyControlActivity f53588b;

    public ys0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f53587a = i7;
        this.f53588b = privacyControlActivity;
    }

    @Override
    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f53587a) {
            case 0:
                this.f53588b.K0();
                return;
            case 1:
                this.f53588b.finishFragment();
                return;
            default:
                this.f53588b.finishFragment();
                return;
        }
    }
}
