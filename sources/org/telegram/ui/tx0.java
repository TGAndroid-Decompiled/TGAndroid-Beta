package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class tx0 implements Runnable {
    public final int f37805a;
    public final PrivacySettingsActivity f37806b;

    public tx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f37805a = i10;
        this.f37806b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37805a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f37806b;
                privacySettingsActivity.f31196a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f37806b.f31200c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f37806b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f30192b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.qc.g(privacySettingsActivity2, ybVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
