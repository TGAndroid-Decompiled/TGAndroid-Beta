package org.telegram.ui;
public final class ww0 implements org.telegram.ui.ActionBar.a2 {
    public final int f42927a;
    public final PrivacyControlActivity f42928b;

    public ww0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42927a = i10;
        this.f42928b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f42927a) {
            case 0:
                this.f42928b.z0();
                return;
            case 1:
                this.f42928b.finishFragment();
                return;
            default:
                this.f42928b.finishFragment();
                return;
        }
    }
}
