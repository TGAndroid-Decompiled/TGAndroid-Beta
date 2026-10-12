package org.telegram.ui;
public final class wx0 implements org.telegram.ui.ActionBar.z1 {
    public final int f41690a;
    public final PrivacyControlActivity f41691b;

    public wx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f41690a = i10;
        this.f41691b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41690a) {
            case 0:
                this.f41691b.z0();
                return;
            case 1:
                this.f41691b.finishFragment();
                return;
            default:
                this.f41691b.finishFragment();
                return;
        }
    }
}
