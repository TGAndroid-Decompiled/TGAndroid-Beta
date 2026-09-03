package org.telegram.ui;
public final class yw0 implements Runnable {
    public final int f40348a;
    public final PrivacyControlActivity f40349b;

    public yw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40348a = i10;
        this.f40349b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f40348a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40349b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f40349b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f40349b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f40349b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
