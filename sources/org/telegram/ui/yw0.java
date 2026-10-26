package org.telegram.ui;
public final class yw0 implements Runnable {
    public final int f46122a;
    public final PrivacyControlActivity f46123b;

    public yw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f46122a = i10;
        this.f46123b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f46122a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f46123b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.V(this.f46123b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f46123b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f46123b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
