package org.telegram.ui;
public final class vw0 implements org.telegram.ui.ActionBar.c2 {
    public final int f39276a;
    public final PrivacyControlActivity f39277b;

    public vw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f39276a = i10;
        this.f39277b = privacyControlActivity;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f39276a) {
            case 0:
                this.f39277b.z0();
                return;
            case 1:
                this.f39277b.finishFragment();
                return;
            default:
                this.f39277b.finishFragment();
                return;
        }
    }
}
