package org.telegram.ui;
public final class sx0 implements Runnable {
    public final int f40245a;
    public final PrivacyControlActivity f40246b;

    public sx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40245a = i10;
        this.f40246b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f40245a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40246b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f40246b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f40246b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f40246b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
