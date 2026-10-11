package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class zx0 implements Runnable {
    public final int f45162a;
    public final PrivacySettingsActivity f45163b;

    public zx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f45162a = i10;
        this.f45163b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f45162a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f45163b;
                privacySettingsActivity.f34259a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f45163b.f34263c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f45163b;
                org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(privacySettingsActivity2.getParentActivity(), null);
                acVar.d(R.raw.email_check_inbox, new String[0]);
                acVar.f24555b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.sc.g(privacySettingsActivity2, acVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
