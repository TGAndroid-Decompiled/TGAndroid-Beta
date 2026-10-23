package org.telegram.ui;
public final class yw0 implements org.telegram.ui.ActionBar.z1 {
    public final int f44001a;
    public final PrivacyControlActivity f44002b;

    public yw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f44001a = i10;
        this.f44002b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f44001a) {
            case 0:
                this.f44002b.z0();
                return;
            case 1:
                this.f44002b.finishFragment();
                return;
            default:
                this.f44002b.finishFragment();
                return;
        }
    }
}
