package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ux0 implements Runnable {
    public final int f41371a;
    public final PrivacySettingsActivity f41372b;

    public ux0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f41371a = i10;
        this.f41372b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f41371a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f41372b;
                privacySettingsActivity.f34194a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f41372b.f34198c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f41372b;
                org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(privacySettingsActivity2.getParentActivity(), null);
                zbVar.d(R.raw.email_check_inbox, new String[0]);
                zbVar.f33472b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.rc.g(privacySettingsActivity2, zbVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
