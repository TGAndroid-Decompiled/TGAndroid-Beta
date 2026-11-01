package org.telegram.ui;
public final class tu0 implements Runnable {
    public final int f41728a;
    public final PrivacySettingsActivity f41729b;

    public tu0(PrivacySettingsActivity privacySettingsActivity, int i10) {
        this.f41728a = i10;
        this.f41729b = privacySettingsActivity;
    }

    @Override
    public final void run() {
        int i10 = this.f41728a;
        PrivacySettingsActivity privacySettingsActivity = this.f41729b;
        switch (i10) {
            case 0:
                privacySettingsActivity.f33766a.f();
                privacySettingsActivity.R = true;
                return;
            case 1:
                privacySettingsActivity.f33770c.dismiss();
                return;
            default:
                org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(privacySettingsActivity.getParentActivity(), null);
                ebVar.d(2131624008, new String[0]);
                ebVar.f25779b.setText(org.telegram.messenger.dd.L0(2131742836, null));
                org.telegram.ui.Components.wb.g(privacySettingsActivity, ebVar, 1500).j();
                try {
                    privacySettingsActivity.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                privacySettingsActivity.E0();
                return;
        }
    }
}
