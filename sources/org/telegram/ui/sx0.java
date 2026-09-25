package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sx0 implements Runnable {
    public final int f37882a;
    public final PrivacySettingsActivity f37883b;

    public sx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f37882a = i10;
        this.f37883b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37882a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f37883b;
                privacySettingsActivity.f31512a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f37883b.f31516c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f37883b;
                org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(privacySettingsActivity2.getParentActivity(), null);
                ybVar.d(R.raw.email_check_inbox, new String[0]);
                ybVar.f30583b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
