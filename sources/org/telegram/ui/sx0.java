package org.telegram.ui;
public final class sx0 implements Runnable {
    public final int f39962a;
    public final PrivacyControlActivity f39963b;

    public sx0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f39962a = i10;
        this.f39963b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f39962a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f39963b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f39963b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f39963b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f39963b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
