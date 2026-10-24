package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class zk0 implements Runnable {
    public final int f44118a;
    public final PasscodeActivity f44119b;
    public final boolean f44120c;

    public zk0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f44118a = i10;
        this.f44119b = passcodeActivity;
        this.f44120c = z10;
    }

    @Override
    public final void run() {
        switch (this.f44118a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f44119b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f44120c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    kb0 kb0Var = passcodeActivity.U;
                    if (kb0Var != null) {
                        AndroidUtilities.runOnUIThread(kb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f44119b;
                passcodeActivity2.f33536w.e(true, this.f44120c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
