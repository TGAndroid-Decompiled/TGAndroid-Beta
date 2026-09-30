package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class sx0 implements Runnable {
    public final int f37989a;
    public final PrivacySettingsActivity f37990b;

    public sx0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f37989a = i10;
        this.f37990b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f37989a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f37990b;
                privacySettingsActivity.f31585a.l();
                privacySettingsActivity.R = true;
                return;
            case 1:
                this.f37990b.f31589c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f37990b;
                org.telegram.ui.Components.zb zbVar = new org.telegram.ui.Components.zb(privacySettingsActivity2.getParentActivity(), null);
                zbVar.d(R.raw.email_check_inbox, new String[0]);
                zbVar.f30942b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
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
