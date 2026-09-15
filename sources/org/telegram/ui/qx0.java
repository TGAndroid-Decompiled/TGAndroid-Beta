package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36953a;
    public final PrivacyControlActivity f36954b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36953a = i10;
        this.f36954b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36953a) {
            case 0:
                this.f36954b.z0();
                return;
            case 1:
                this.f36954b.finishFragment();
                return;
            default:
                this.f36954b.finishFragment();
                return;
        }
    }
}
