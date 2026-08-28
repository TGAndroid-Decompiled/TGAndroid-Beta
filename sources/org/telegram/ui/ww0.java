package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ww0 implements Runnable {
    public final int f44272a;
    public final PrivacySettingsActivity f44273b;

    public ww0(PrivacySettingsActivity privacySettingsActivity, int i9) {
        this.f44272a = i9;
        this.f44273b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f44272a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f44273b;
                privacySettingsActivity.f35907a.l();
                privacySettingsActivity.N = true;
                return;
            case 1:
                this.f44273b.f35909c.dismiss();
                return;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f44273b;
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(privacySettingsActivity2.getParentActivity(), null);
                obVar.d(R.raw.email_check_inbox, new String[0]);
                obVar.f31343b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.gc.g(privacySettingsActivity2, obVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity2.y0();
                return;
        }
    }
}
