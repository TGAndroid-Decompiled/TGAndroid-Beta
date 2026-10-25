package org.telegram.ui;
public final class yw0 implements Runnable {
    public final int f46119a;
    public final PrivacyControlActivity f46120b;

    public yw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f46119a = i10;
        this.f46120b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f46119a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f46120b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.V(this.f46120b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f46120b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f46120b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
