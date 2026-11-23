package org.telegram.ui;
public final class ys0 implements Runnable {
    public final int f54288a;
    public final PrivacyControlActivity f54289b;

    public ys0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f54288a = i7;
        this.f54289b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f54288a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f54289b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f54289b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f54289b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f54289b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
