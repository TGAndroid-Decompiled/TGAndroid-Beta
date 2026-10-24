package org.telegram.ui;
public final class xw0 implements org.telegram.ui.ActionBar.z1 {
    public final int f43703a;
    public final PrivacyControlActivity f43704b;

    public xw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f43703a = i10;
        this.f43704b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f43703a) {
            case 0:
                this.f43704b.z0();
                return;
            case 1:
                this.f43704b.finishFragment();
                return;
            default:
                this.f43704b.finishFragment();
                return;
        }
    }
}
