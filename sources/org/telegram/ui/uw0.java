package org.telegram.ui;
public final class uw0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42065a;
    public final PrivacyControlActivity f42066b;

    public uw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42065a = i10;
        this.f42066b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42065a) {
            case 0:
                this.f42066b.z0();
                return;
            case 1:
                this.f42066b.finishFragment();
                return;
            default:
                this.f42066b.finishFragment();
                return;
        }
    }
}
