package org.telegram.ui;
public final class tw0 implements Runnable {
    public final int f41728a;
    public final PrivacyControlActivity f41729b;

    public tw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f41728a = i10;
        this.f41729b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f41728a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f41729b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f41729b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f41729b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f41729b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
