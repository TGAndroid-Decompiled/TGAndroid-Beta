package org.telegram.ui;
public final class xw0 implements org.telegram.ui.ActionBar.c2 {
    public final int f43488a;
    public final PrivacyControlActivity f43489b;

    public xw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f43488a = i10;
        this.f43489b = privacyControlActivity;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f43488a) {
            case 0:
                this.f43489b.z0();
                return;
            case 1:
                this.f43489b.finishFragment();
                return;
            default:
                this.f43489b.finishFragment();
                return;
        }
    }
}
