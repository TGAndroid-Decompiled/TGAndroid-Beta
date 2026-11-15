package org.telegram.ui;
public final class us0 implements Runnable {
    public final int f52020a;
    public final PrivacyControlActivity f52021b;

    public us0(PrivacyControlActivity privacyControlActivity, int i7) {
        this.f52020a = i7;
        this.f52021b = privacyControlActivity;
    }

    @Override
    public final void run() {
        switch (this.f52020a) {
            case 0:
                PrivacyControlActivity privacyControlActivity = this.f52021b;
                privacyControlActivity.getClass();
                privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            case 1:
                PrivacyControlActivity.Z(this.f52021b);
                return;
            case 2:
                PrivacyControlActivity privacyControlActivity2 = this.f52021b;
                privacyControlActivity2.getClass();
                privacyControlActivity2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                return;
            default:
                PrivacyControlActivity privacyControlActivity3 = this.f52021b;
                privacyControlActivity3.getClass();
                privacyControlActivity3.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
        }
    }
}
