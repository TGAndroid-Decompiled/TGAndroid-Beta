package org.telegram.ui;
public final class rs0 implements org.telegram.ui.ActionBar.p1 {
    public final int f49271a;
    public final PrivacyControlActivity f49272b;

    public rs0(PrivacyControlActivity privacyControlActivity, int i3) {
        this.f49271a = i3;
        this.f49272b = privacyControlActivity;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f49271a) {
            case 0:
                this.f49272b.K0();
                return;
            case 1:
                this.f49272b.finishFragment();
                return;
            default:
                this.f49272b.finishFragment();
                return;
        }
    }
}
