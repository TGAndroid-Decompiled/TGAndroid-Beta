package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f41221a;
    public final PrivacyControlActivity f41222b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f41221a = i10;
        this.f41222b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f41221a) {
            case 0:
                this.f41222b.z0();
                return;
            case 1:
                this.f41222b.finishFragment();
                return;
            default:
                this.f41222b.finishFragment();
                return;
        }
    }
}
