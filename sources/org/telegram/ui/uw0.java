package org.telegram.ui;
public final class uw0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42061a;
    public final PrivacyControlActivity f42062b;

    public uw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42061a = i10;
        this.f42062b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42061a) {
            case 0:
                this.f42062b.z0();
                return;
            case 1:
                this.f42062b.finishFragment();
                return;
            default:
                this.f42062b.finishFragment();
                return;
        }
    }
}
