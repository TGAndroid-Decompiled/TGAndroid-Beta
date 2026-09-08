package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f40023a;
    public final PrivacyControlActivity f40024b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40023a = i10;
        this.f40024b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40023a) {
            case 0:
                this.f40024b.z0();
                return;
            case 1:
                this.f40024b.finishFragment();
                return;
            default:
                this.f40024b.finishFragment();
                return;
        }
    }
}
