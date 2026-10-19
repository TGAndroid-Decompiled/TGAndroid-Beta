package org.telegram.ui;
public final class uw0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42056a;
    public final PrivacyControlActivity f42057b;

    public uw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42056a = i10;
        this.f42057b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42056a) {
            case 0:
                this.f42057b.z0();
                return;
            case 1:
                this.f42057b.finishFragment();
                return;
            default:
                this.f42057b.finishFragment();
                return;
        }
    }
}
