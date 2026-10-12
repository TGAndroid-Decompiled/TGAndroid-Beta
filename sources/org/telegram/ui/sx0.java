package org.telegram.ui;
public final class sx0 implements org.telegram.ui.ActionBar.z1 {
    public final int f42019a;
    public final PrivacyControlActivity f42020b;

    public sx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42019a = i10;
        this.f42020b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f42019a) {
            case 0:
                this.f42020b.z0();
                return;
            case 1:
                this.f42020b.finishFragment();
                return;
            default:
                this.f42020b.finishFragment();
                return;
        }
    }
}
