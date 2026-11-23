package org.telegram.ui;
public final class zs0 implements Runnable {
    public final int f54594a;
    public final PrivacyControlActivity f54595b;

    public zs0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f54594a = i7;
        this.f54595b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f54594a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f54595b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f54595b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f54595b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f54595b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
