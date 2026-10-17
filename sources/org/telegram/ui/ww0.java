package org.telegram.ui;
public final class ww0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42943a;
    public final PrivacyControlActivity f42944b;

    public ww0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42943a = i10;
        this.f42944b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42943a) {
            case 0:
                this.f42944b.z0();
                return;
            case 1:
                this.f42944b.finishFragment();
                return;
            default:
                this.f42944b.finishFragment();
                return;
        }
    }
}
