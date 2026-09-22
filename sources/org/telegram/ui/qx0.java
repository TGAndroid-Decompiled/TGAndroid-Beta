package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f36955a;
    public final PrivacyControlActivity f36956b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f36955a = i10;
        this.f36956b = privacyControlActivity;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f36955a) {
            case 0:
                this.f36956b.z0();
                return;
            case 1:
                this.f36956b.finishFragment();
                return;
            default:
                this.f36956b.finishFragment();
                return;
        }
    }
}
