package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f39996a;
    public final PrivacyControlActivity f39997b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f39996a = i10;
        this.f39997b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39996a) {
            case 0:
                this.f39997b.z0();
                return;
            case 1:
                this.f39997b.finishFragment();
                return;
            default:
                this.f39997b.finishFragment();
                return;
        }
    }
}
