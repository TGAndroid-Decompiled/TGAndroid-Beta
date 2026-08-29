package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class rk0 implements Runnable {
    public final int f42126a;
    public final PasscodeActivity f42127b;
    public final boolean f42128c;

    public rk0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f42126a = i10;
        this.f42127b = passcodeActivity;
        this.f42128c = z10;
    }

    @Override
    public final void run() {
        switch (this.f42126a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f42127b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f42128c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    hb0 hb0Var = passcodeActivity.M;
                    if (hb0Var != null) {
                        AndroidUtilities.runOnUIThread(hb0Var);
                        passcodeActivity.M = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f42127b;
                passcodeActivity2.f35640w.e(true, this.f42128c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.L);
                return;
        }
    }
}
