package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class ww0 implements Runnable {

    public final int f44205a;

    public final PrivacySettingsActivity f44206b;

    public ww0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f44205a = i10;
        this.f44206b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        switch (this.f44205a) {
            case 0:
                PrivacySettingsActivity privacySettingsActivity = this.f44206b;
                privacySettingsActivity.f35910a.l();
                privacySettingsActivity.N = true;
                break;
            case 1:
                this.f44206b.f35912c.dismiss();
                break;
            default:
                PrivacySettingsActivity privacySettingsActivity2 = this.f44206b;
                org.telegram.ui.Components.mb mbVar = new org.telegram.ui.Components.mb(privacySettingsActivity2.getParentActivity(), null);
                mbVar.d(R.raw.email_check_inbox, new String[0]);
                mbVar.f30639b.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
                org.telegram.ui.Components.ec.g(privacySettingsActivity2, mbVar, 1500).j();
                try {
                    privacySettingsActivity2.fragmentView.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                }
                privacySettingsActivity2.z0();
                break;
        }
    }
}
