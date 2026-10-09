package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f41219a;
    public final PrivacyControlActivity f41220b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f41219a = i10;
        this.f41220b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41219a) {
            case 0:
                this.f41220b.z0();
                return;
            case 1:
                this.f41220b.finishFragment();
                return;
            default:
                this.f41220b.finishFragment();
                return;
        }
    }
}
