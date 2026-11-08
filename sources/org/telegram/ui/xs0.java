package org.telegram.ui;
public final class xs0 implements Runnable {
    public final int f51972a;
    public final PrivacyControlActivity f51973b;

    public xs0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f51972a = i7;
        this.f51973b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f51972a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f51973b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f51973b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f51973b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f51973b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
