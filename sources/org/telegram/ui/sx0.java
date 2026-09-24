package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sx0 implements Runnable {
    public final int f37864a;
    public final PrivacySettingsActivity f37865b;

    public sx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f37864a = i10;
        this.f37865b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37864a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f37865b;
                privacySettingsActivity.f31497a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f37865b.f31501c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f37865b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f30575b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
