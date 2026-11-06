package org.telegram.ui;
public final class ws0 implements Runnable {
    public final int f51489a;
    public final PrivacyControlActivity f51490b;

    public ws0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f51489a = i7;
        this.f51490b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f51489a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f51490b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f51490b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f51490b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f51490b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
