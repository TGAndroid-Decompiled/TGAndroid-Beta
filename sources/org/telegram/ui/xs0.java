package org.telegram.ui;
public final class xs0 implements Runnable {
    public final int f54071a;
    public final PrivacyControlActivity f54072b;

    public xs0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f54071a = i7;
        this.f54072b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f54071a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f54072b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f54072b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f54072b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f54072b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
