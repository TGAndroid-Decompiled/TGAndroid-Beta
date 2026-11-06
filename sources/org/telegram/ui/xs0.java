package org.telegram.ui;
public final class xs0 implements Runnable {
    public final int f51979a;
    public final PrivacyControlActivity f51980b;

    public xs0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f51979a = i7;
        this.f51980b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f51979a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f51980b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f51980b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f51980b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f51980b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
