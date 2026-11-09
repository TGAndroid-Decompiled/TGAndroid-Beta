package org.telegram.ui;
public final class zs0 implements Runnable {
    public final int f52667a;
    public final PrivacyControlActivity f52668b;

    public zs0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f52667a = i7;
        this.f52668b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f52667a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f52668b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f52668b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f52668b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f52668b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
