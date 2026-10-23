package org.telegram.ui;
public final class uw0 implements Runnable {
    public final int f42534a;
    public final PrivacyControlActivity f42535b;

    public uw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42534a = i10;
        this.f42535b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f42534a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f42535b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f42535b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f42535b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f42535b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
