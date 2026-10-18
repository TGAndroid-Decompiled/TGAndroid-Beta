package org.telegram.ui;
public final class ww0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42963a;
    public final PrivacyControlActivity f42964b;

    public ww0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42963a = i10;
        this.f42964b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42963a) {
            case 0:
                this.f42964b.z0();
                return;
            case 1:
                this.f42964b.finishFragment();
                return;
            default:
                this.f42964b.finishFragment();
                return;
        }
    }
}
