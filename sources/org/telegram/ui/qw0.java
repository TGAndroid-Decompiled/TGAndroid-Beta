package org.telegram.ui;
public final class qw0 implements Runnable {
    public final int f40993a;
    public final PrivacyControlActivity f40994b;

    public qw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40993a = i10;
        this.f40994b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f40993a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f40994b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f40994b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f40994b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f40994b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
