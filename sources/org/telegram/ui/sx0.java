package org.telegram.ui;
public final class sx0 implements org.telegram.ui.ActionBar.c2 {
    public final int f36774a;
    public final PrivacyControlActivity f36775b;

    public sx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36774a = i10;
        this.f36775b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f36774a) {
            case 0:
                this.f36775b.z0();
                return;
            case 1:
                this.f36775b.finishFragment();
                return;
            default:
                this.f36775b.finishFragment();
                return;
        }
    }
}
