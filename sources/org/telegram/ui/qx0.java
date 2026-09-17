package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39997a;
    public final PrivacyControlActivity f39998b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f39997a = i10;
        this.f39998b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39997a) {
            case 0:
                this.f39998b.z0();
                return;
            case 1:
                this.f39998b.finishFragment();
                return;
            default:
                this.f39998b.finishFragment();
                return;
        }
    }
}
