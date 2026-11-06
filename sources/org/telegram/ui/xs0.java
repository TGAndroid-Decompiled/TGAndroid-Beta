package org.telegram.ui;
public final class xs0 implements Runnable {
    public final int f51981a;
    public final PrivacyControlActivity f51982b;

    public xs0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f51981a = i7;
        this.f51982b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f51981a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f51982b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f51982b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f51982b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f51982b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
