package org.telegram.ui;
public final class wx0 implements org.telegram.ui.ActionBar.z1 {
    public final int f41377a;
    public final PrivacyControlActivity f41378b;

    public wx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f41377a = i10;
        this.f41378b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f41377a) {
            case 0:
                this.f41378b.z0();
                return;
            case 1:
                this.f41378b.finishFragment();
                return;
            default:
                this.f41378b.finishFragment();
                return;
        }
    }
}
