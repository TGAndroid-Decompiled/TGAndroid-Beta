package org.telegram.ui;
public final class sx0 implements org.telegram.ui.ActionBar.z1 {
    public final int f42023a;
    public final PrivacyControlActivity f42024b;

    public sx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42023a = i10;
        this.f42024b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f42023a) {
            case 0:
                this.f42024b.z0();
                return;
            case 1:
                this.f42024b.finishFragment();
                return;
            default:
                this.f42024b.finishFragment();
                return;
        }
    }
}
