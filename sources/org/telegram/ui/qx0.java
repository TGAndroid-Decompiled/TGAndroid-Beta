package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36979a;
    public final PrivacyControlActivity f36980b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36979a = i10;
        this.f36980b = privacyControlActivity;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36979a) {
            case 0:
                this.f36980b.z0();
                return;
            case 1:
                this.f36980b.finishFragment();
                return;
            default:
                this.f36980b.finishFragment();
                return;
        }
    }
}
