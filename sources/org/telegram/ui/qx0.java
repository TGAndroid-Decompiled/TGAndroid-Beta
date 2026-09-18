package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36893a;
    public final PrivacyControlActivity f36894b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36893a = i10;
        this.f36894b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36893a) {
            case 0:
                this.f36894b.z0();
                return;
            case 1:
                this.f36894b.finishFragment();
                return;
            default:
                this.f36894b.finishFragment();
                return;
        }
    }
}
