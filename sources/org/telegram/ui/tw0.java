package org.telegram.ui;
public final class tw0 implements Runnable {
    public final int f42143a;
    public final PrivacyControlActivity f42144b;

    public tw0(PrivacyControlActivity privacyControlActivity, int i10) {
        this.f42143a = i10;
        this.f42144b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f42143a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f42144b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.U(this.f42144b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f42144b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f42144b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
