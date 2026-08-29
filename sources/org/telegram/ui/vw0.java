package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class vw0 implements Runnable {
    public final int f43792a;
    public final PrivacySettingsActivity f43793b;

    public vw0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f43792a = i10;
        this.f43793b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f43792a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f43793b;
                privacySettingsActivity.f35973a.l();
                privacySettingsActivity.N = true;
                return;
            case 1:
                this.f43793b.f35975c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f43793b;
                org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(privacySettingsActivity2.getParentActivity(), null);
                ubVar.d(R.raw.email_check_inbox, new String[0]);
                ubVar.f33185b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.mc.g(privacySettingsActivity2, ubVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                return;
        }
    }
}
