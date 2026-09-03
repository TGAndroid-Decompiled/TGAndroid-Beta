package org.telegram.ui;
public final class yw0 implements Runnable {
    public final int f43723a;
    public final PrivacyControlActivity f43724b;

    public yw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f43723a = i10;
        this.f43724b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f43723a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f43724b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f43724b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f43724b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f43724b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
