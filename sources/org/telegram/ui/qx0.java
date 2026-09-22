package org.telegram.ui;
public final class qx0 implements org.telegram.ui.ActionBar.a2 {
    public final int f37002a;
    public final PrivacyControlActivity f37003b;

    public qx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f37002a = i10;
        this.f37003b = privacyControlActivity;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f37002a) {
            case 0:
                this.f37003b.z0();
                return;
            case 1:
                this.f37003b.finishFragment();
                return;
            default:
                this.f37003b.finishFragment();
                return;
        }
    }
}
