package org.telegram.ui;
public final class sx0 implements org.telegram.ui.ActionBar.b2 {
    public final int f37565a;
    public final PrivacyControlActivity f37566b;

    public sx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f37565a = i10;
        this.f37566b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f37565a) {
            case 0:
                this.f37566b.z0();
                return;
            case 1:
                this.f37566b.finishFragment();
                return;
            default:
                this.f37566b.finishFragment();
                return;
        }
    }
}
