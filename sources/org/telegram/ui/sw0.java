package org.telegram.ui;
public final class sw0 implements Runnable {
    public final int f41517a;
    public final PrivacyControlActivity f41518b;

    public sw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f41517a = i10;
        this.f41518b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f41517a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f41518b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f41518b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f41518b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f41518b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
