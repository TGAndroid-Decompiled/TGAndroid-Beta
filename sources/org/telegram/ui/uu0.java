package org.telegram.ui;
public final class uu0 implements Runnable {
    public final int f42528a;
    public final PrivacySettingsActivity f42529b;

    public uu0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f42528a = i10;
        this.f42529b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f42528a;
        PrivacySettingsActivity privacySettingsActivity = this.f42529b;
        switch (i10) {
            case 0:
                privacySettingsActivity.f33759a.f();
                privacySettingsActivity.R = true;
                return;
            case 1:
                privacySettingsActivity.f33763c.dismiss();
                return;
            default:
                org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(privacySettingsActivity.getParentActivity(), null);
                ebVar.d(2131624008, new String[0]);
                ebVar.f25745b.setText(org.telegram.messenger.cd.L0(2131742836, null));
                org.telegram.ui.Components.wb.g(privacySettingsActivity, ebVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.D0();
                return;
        }
    }
}
