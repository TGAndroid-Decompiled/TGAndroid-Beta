package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f40024a;
    public final PrivacyControlActivity f40025b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40024a = i10;
        this.f40025b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40024a) {
            case 0:
                this.f40025b.z0();
                return;
            case 1:
                this.f40025b.finishFragment();
                return;
            default:
                this.f40025b.finishFragment();
                return;
        }
    }
}
