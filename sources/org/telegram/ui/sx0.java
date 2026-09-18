package org.telegram.ui;
public final class sx0 implements org.telegram.ui.ActionBar.b2 {
    public final int f37570a;
    public final PrivacyControlActivity f37571b;

    public sx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f37570a = i10;
        this.f37571b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37570a) {
            case 0:
                this.f37571b.z0();
                return;
            case 1:
                this.f37571b.finishFragment();
                return;
            default:
                this.f37571b.finishFragment();
                return;
        }
    }
}
