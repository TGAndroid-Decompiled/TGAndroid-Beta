package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ux0 implements Runnable {
    public final int f38374a;
    public final PrivacySettingsActivity f38375b;

    public ux0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f38374a = i10;
        this.f38375b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f38374a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f38375b;
                privacySettingsActivity.f31513a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f38375b.f31517c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f38375b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f30642b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
