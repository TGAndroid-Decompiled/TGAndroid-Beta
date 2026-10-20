package org.telegram.ui;
public final class qw0 implements Runnable {
    public final int f40999a;
    public final PrivacyControlActivity f41000b;

    public qw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f40999a = i10;
        this.f41000b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f40999a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f41000b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f41000b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f41000b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f41000b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
