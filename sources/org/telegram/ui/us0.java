package org.telegram.ui;
public final class us0 implements Runnable {
    public final int f52018a;
    public final PrivacyControlActivity f52019b;

    public us0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f52018a = i7;
        this.f52019b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f52018a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f52019b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f52019b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f52019b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f52019b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
