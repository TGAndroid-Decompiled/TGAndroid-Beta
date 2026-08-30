package org.telegram.ui;
public final class rw0 implements Runnable {
    public final int f38133a;
    public final PrivacyControlActivity f38134b;

    public rw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f38133a = i10;
        this.f38134b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f38133a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f38134b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f38134b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f38134b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f38134b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
