package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xk0 implements Runnable {
    public final int f43222a;
    public final PasscodeActivity f43223b;
    public final boolean f43224c;

    public xk0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f43222a = i10;
        this.f43223b = passcodeActivity;
        this.f43224c = z10;
    }

    @Override
    public final void run() {
        switch (this.f43222a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43223b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f43224c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    eb0 eb0Var = passcodeActivity.U;
                    if (eb0Var != null) {
                        AndroidUtilities.runOnUIThread(eb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f43223b;
                passcodeActivity2.f33226w.e(true, this.f43224c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
